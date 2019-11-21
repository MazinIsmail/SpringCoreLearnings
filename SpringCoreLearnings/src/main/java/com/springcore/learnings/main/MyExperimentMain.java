package com.springcore.learnings.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springcore.learnings.Interface.BankAccount;
import com.springcore.learnings.beans.CurrentAccount;
import com.springcore.learnings.beans.SavingsAccount;

/*
 * The @ComponentScan annotation is used with the @Configuration annotation to tell Spring the packages to scan 
	for annotated components. @ComponentScan also used to specify base packages and base package 
	classes using thebasePackageClasses or basePackages attributes of @ComponentScan.
*/
@ComponentScan("com.springcore.learnings.*")
@SpringBootApplication
public class MyExperimentMain {

	public static void main(String[] args) {

		/* Default */

		// SpringApplication.run(MyExperimentMain.class, args);

		/*
		 * .run() method returns an object of ConfigurableApplicationContext. Using that
		 * object we can invoke getbean() method
		 */

		ConfigurableApplicationContext applicationContext = SpringApplication.run(MyExperimentMain.class, args);

		/*
		 * Acquiring Beans using @Componenet annotation above the SavingsAccount class
		 */

		CurrentAccount currentAccount = applicationContext.getBean(CurrentAccount.class);
		currentAccount.setBalanceAmount(20000);

		/*
		 * Acquiring Beans using Beans defined using @Bean annotation in configuration
		 * class ExperimentConfigurations.java annotated with @configuration.
		 */
		SavingsAccount savingsAccount = applicationContext.getBean("yourSavingsAccount", SavingsAccount.class);

		savingsAccount.getUser().setUserName("PK");

		savingsAccount.getUser().showBalance();

		System.out.println("Balance" + savingsAccount.getUser().showBalance());

	}

}
