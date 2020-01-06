package com.cts.spring.ioc;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Application {

	public static void main(String[] args) {
	/*	XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("resources/applicationContext.xml"));
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
		System.out.println(obj.getMessage()); */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj.getMessage());
		
	}
}
