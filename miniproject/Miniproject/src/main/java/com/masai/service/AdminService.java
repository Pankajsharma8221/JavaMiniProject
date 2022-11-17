package com.masai.service;

import java.util.List;

import com.masai.dto.LoginDTO;
import com.masai.dto.LogoutDTO;
import com.masai.exception.AdminException;
import com.masai.exception.CustomerException;
import com.masai.model.*;


public interface AdminService {
	//--------------------------adding admin-----------------------------------
	public Admin registerAsAdmin(Admin admin) throws AdminException;
	
//	---------------------------login admin---------------------------------
	public String login(LoginDTO user) throws AdminException;
	
//	------------------------updating admin-----------------------------------
	public Admin updateAdmin(Admin admin) throws AdminException;
	
//	--------------------------delete admin-----------------------------------
	public LogoutDTO deleteAdmin(Integer AdminId) throws AdminException;
	
//	---------------------------view all customer-----------------------------
	public List<Customer> viewAllCustomers(String userName) throws AdminException,CustomerException;
	
//	----------------------------log out admin--------------------------------
	public LogoutDTO logOutAdmin(String user) throws AdminException;
	
//	-----------------------------validate admin------------------------------
	public Boolean validateAdmin(String user) throws AdminException;
	
//	-----------------------------getCustomerById--------------------------
	public Customer getCustomerById(Integer customerId, String user) throws CustomerException,AdminException;
	
}
