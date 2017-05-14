package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSetterApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from the spring container
		//CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class);
		Soccer theCoach=context.getBean("mySoccerCoach",Soccer.class);
		//call methods on the bean
		//System.out.println("My Cricket Coach: "+ theCoach.getDailyWorkout());
		//System.out.println(theCoach.getEmailAddress());
		//System.out.println(theCoach.getTeamName());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		//close the context
		context.close();
	}

}
