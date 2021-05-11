package com.srm.rsc.S2JDTPOSReport.Customer;
import java.util.*;

public class Customer extends BaseClass{

	
	public int customerId;
	
	public String username;
	
	public String password;
	


	public Customer(int customerId, String username, String password) {
		super();
		this.customerId = customerId;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", username=" + username + ", password=" + password + "]";
	}

	public Integer getCustomerId() {
		return Integer.valueOf(customerId);
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
