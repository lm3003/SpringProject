package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
			
		//retrieve the bean from the spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		boolean result=(theCoach==alphaCoach);
		System.out.println("\nPointing to the same object: "+ result);
		
		System.out.println("\nMemory location for theCoach: "+ theCoach);
		System.out.println("\nMemory location for theCoach: "+ alphaCoach);
		
		//Close context
		context.close();
		
	}

}
