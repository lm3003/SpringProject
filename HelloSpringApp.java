package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		Coach theCoach=context.getBean("myCricketCoach",Coach.class);
		Coach alphaCoach=context.getBean("myCricketCoach",Coach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//test the scope
		boolean result=(theCoach==alphaCoach);
		System.out.println("Is the reference same?: "+result);
		
		// close the context
		context.close();

	}

}
