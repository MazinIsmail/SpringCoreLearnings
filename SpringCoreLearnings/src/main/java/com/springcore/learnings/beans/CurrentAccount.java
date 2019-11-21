package com.springcore.learnings.beans;

import org.springframework.stereotype.Component;

import com.springcore.learnings.Interface.BankAccount;

@Component
public class CurrentAccount implements BankAccount {

	private double accountID;

	private double balanceAmount;

	public double getAccountID() {
		return accountID;
	}

	public void setAccountID(double accountID) {
		this.accountID = accountID;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	@Override
	public double getBalance() {
		return this.balanceAmount;
	}

}
