package com.shopeasy.services;

import com.shopeasy.exceptions.LoginException;
import com.shopeasy.models.CustomerLoginDTO;

public interface CustomerLoginService {

	public String logIntoAccount(CustomerLoginDTO dto) throws LoginException;

	public String logOutFromAccount(String key) throws LoginException;

}
