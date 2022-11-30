package com.shopeasy.services;

import com.shopeasy.exceptions.LoginException;
import com.shopeasy.models.AdminLoginDTO;

public interface AdminLoginService {

	public String logIntoAccount(AdminLoginDTO dto) throws LoginException;

	public String logOutFromAccount(String key) throws LoginException;

}
