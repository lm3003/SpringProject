package com.luv2code.springdemo;

public class trackCoach implements Coach {
	private FortuneService fortuneService;
	
	
	public trackCoach(){
		
	}
	
	public trackCoach(FortuneService theForturneService) {
		fortuneService = theForturneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Run hard 5k daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it: " + fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartUpStuff(){
		System.out.println("Track Coach: Do my startup stuff: ");
	}
	
	
	//add an destroy method method
	public void doMyCleanUpStuff(){
		System.out.println("Track Coach: Do my cleanup stuff Yeyyy!!: ");
	}

}
