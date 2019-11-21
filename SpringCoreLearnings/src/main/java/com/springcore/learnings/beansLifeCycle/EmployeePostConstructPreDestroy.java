package com.springcore.learnings.beansLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class EmployeePostConstructPreDestroy {
	
	@PostConstruct
	public void customInit() {
		System.out.println("Inside PostConstructor");
	}

	@PreDestroy
	public void customDestroy() {
		System.out.println("Inside PreDestroy");
	}

}
