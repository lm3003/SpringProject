package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
			
		//retrieve the bean from the spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
				
		System.out.println(theCoach.getDailyWorkout());
		
		//Close context
		context.close();
		
	}

}
