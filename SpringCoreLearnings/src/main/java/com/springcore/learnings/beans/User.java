package com.springcore.learnings.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springcore.learnings.Interface.BankAccount;

@Component
public class User {

	private int userId;
	private String userName;
	private String location;

	@Qualifier("currentAccount")
	@Autowired
	private BankAccount bankAccount;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double showBalance() {
		return bankAccount.getBalance();
	}

}
