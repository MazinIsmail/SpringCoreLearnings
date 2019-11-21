package com.springcore.learnings.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springcore.learnings.beans.SavingsAccount;
import com.springcore.learnings.beans.User;

@Configuration
public class ExperimentConfigurations {

	@Bean
	public SavingsAccount yourSavingsAccount() {

		// SavingsAccount savingsAccount = new SavingsAccount();

		/*
		 * While using Constructor injection : The parameterized constructor of
		 * SavingsAccount should be annotated with @Autowired instead of the member
		 * variable
		 */
		SavingsAccount savingsAccount = new SavingsAccount(ourUser());
		return savingsAccount;
	}

	@Bean
	public User ourUser() {
		User user = new User();
		return user;
	}

}
