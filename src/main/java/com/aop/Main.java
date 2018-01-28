package com.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("com//aop//spring-config.xml");
		CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
		customer.addCustomer();
		customer.addCustomerReturnValue();
        customer.addCustomerAround("dkksck");
        
	}

}
