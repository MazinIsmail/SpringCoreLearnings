package com.springcore.learnings.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.springcore.learnings.Interface.BankAccount;

/**
 * Commented when creating Bean using @Bean annotation or XML file.
 * 
 */
public class SavingsAccount implements InitializingBean, DisposableBean,BankAccount	 {

	private int accountId;
	private String branchName;

	/* To be commented while using Constructor injection or setter injection */
	// @Autowired
	private User user;

	/* To be annotated while performing Constructor injection */
	// @Autowired
	public SavingsAccount(User user) {
		this.user = user;
	}

	public String displayUserDetails() {
		return user.getUserName();
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside DisposableBean");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside InitializingBean");

	}

	@PostConstruct
	public void customInit() {
		System.out.println("Inside PostConstructor");
	}

	@PreDestroy
	public void customDestroy() {
		System.out.println("Inside PreDestroy");
	}

	@PostConstruct
	public void customInitAgain() {
		System.out.println("Inside PostConstructor again");
	}

	@PreDestroy
	public void customDestroyAgain() {
		System.out.println("Inside PreDestroy again");
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountId=" + accountId + ", branchName=" + branchName + "]";
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}



}
