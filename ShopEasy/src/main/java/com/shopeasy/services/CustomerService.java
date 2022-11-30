package com.shopeasy.services;

import java.util.List;

import com.shopeasy.exceptions.AdminException;
import com.shopeasy.exceptions.CustomerException;
import com.shopeasy.models.Customer;

public interface CustomerService {

	public Customer createCustomer(Customer customer) throws CustomerException;

	public Customer updateCustomer(Customer customer, String key) throws CustomerException;

	public String deleteCustomerById(Integer customerId) throws CustomerException;

	public List<Customer> getAllCustomersDeatils(String key) throws CustomerException, AdminException;

}
