package com.luv2code.springdemo;

public class Soccer implements Coach {

	private FortuneService fortunes;
	
	public Soccer(){
		
	}
	
	public void setFortunes(FortuneService fortunes) {
		this.fortunes = fortunes;
	}

//	public void setFortuneService(FortuneService fortunes){
//		this.fortunes=fortunes;
//	}
	
	@Override
	public String getDailyWorkout(){
		return "Play Soccer Everyday";
	}
	
	@Override
	public String getDailyFortune(){
		return fortunes.getFortune();
		
	}

}
