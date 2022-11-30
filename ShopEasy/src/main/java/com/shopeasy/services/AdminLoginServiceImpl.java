package com.shopeasy.services;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopeasy.exceptions.LoginException;
import com.shopeasy.models.Admin;
import com.shopeasy.models.AdminLoginDTO;
import com.shopeasy.models.CurrentAdminSession;
import com.shopeasy.repositories.AdminDao;
import com.shopeasy.repositories.AdminSessionDao;

import net.bytebuddy.utility.RandomString;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {

	@Autowired
	private AdminDao aDao;

	@Autowired
	private AdminSessionDao asDao;

	@Override
	public String logIntoAccount(AdminLoginDTO dto) throws LoginException {

		Optional<Admin> opt = aDao.findById(dto.getAdminId());
		Admin existingAdmin = opt.get();

		if (existingAdmin == null) {

			throw new LoginException("Please Enter a valid AdminId");

		}

		Optional<CurrentAdminSession> validAdminSessionOpt = asDao.findById(existingAdmin.getAdminId());

		if (validAdminSessionOpt.isPresent()) {

			throw new LoginException("Admin already Logged In with this AdminId");

		}

		if (existingAdmin.getAdminPass().equals(dto.getPassword())) {

			String key = RandomString.make(6);

			CurrentAdminSession currentAdminSession = new CurrentAdminSession(existingAdmin.getAdminId(), key,
					LocalDateTime.now());

			asDao.save(currentAdminSession);

			return currentAdminSession.toString();
		} else
			throw new LoginException("Please Enter a valid Admin password");

	}

	@Override
	public String logOutFromAccount(String key) throws LoginException {

		CurrentAdminSession validAdminSession = asDao.findByUuid(key);

		if (validAdminSession == null) {
			throw new LoginException("Admin Not Logged In with this Admin Id");

		}

		asDao.delete(validAdminSession);

		return "Admin Logged Out !";

	}

}
