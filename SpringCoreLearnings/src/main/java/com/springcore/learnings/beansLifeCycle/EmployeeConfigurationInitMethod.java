package com.springcore.learnings.beansLifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring @Configuration annotation helps in Spring annotation based
 * configuration. @Configuration annotation indicates that a class declares one
 * or more @Bean methods and may be processed by the Spring container to
 * generate bean definitions and service requests for those beans at runtime.
 * 
 * Since spring 2, we were writing our bean configurations to xml files. But
 * Spring 3 gave the freedom to move bean definitions out of xml files. we can
 * give bean definitions in Java files itself. This is called Spring Java Config
 * feature (using @Configuration annotation).
 */

/**
 * 
 * @Component is a class level annotation where as 
 * @Bean is a method level annotation and name of the method serves as the bean name.
 *
 */
@Configuration
public class EmployeeConfigurationInitMethod {

	/*
	 * @Bean(initMethod = "initMethodName") public EmployeeAwareInterfaces
	 * getEmployeeAwareInterfaces() { return new EmployeeAwareInterfaces(); }
	 */

	@Bean
	public EmployeeInitializingBeanDisposableBean getEmployeeInitializingBeanDisposableBean() {
		return new EmployeeInitializingBeanDisposableBean();
	}

	@Bean
	public EmployeePostConstructPreDestroy EmployeePostConstructPreDestroy() {
		return new EmployeePostConstructPreDestroy();
	}

	/*
	 * In other words, if you don't specify destroyMethod, but the bean has a public
	 * close() or shutdown() method, it will be automatically used as the
	 * destroy-method.
	 * 
	 * To disable this inference, use @Bean(destroyMethod = "").
	 * 
	 * 
	 * 
	 */

}
