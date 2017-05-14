package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService theFortuneService;
	
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService){
		theFortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkout(){
		return "Spend 30 mins on baseball practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortune service to get a fortune
		return theFortuneService.getFortune();
	}

}
