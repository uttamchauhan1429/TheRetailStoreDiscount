package com.assessment.retaildiscount.models;

import java.util.Date;

import com.assessment.retaildiscount.enums.UserType;

/**
 * User model contains user information
 * @author uttamchauhan
 *
 */
public class User {	
	private long userId;
	
	private String userName;
	
	private UserType userType;

	private Date customerSince;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public Date getCustomerSince() {
		return customerSince;
	}

	public void setCustomerSince(Date customerSince) {
		this.customerSince = customerSince;
	}
	
}
