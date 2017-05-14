package com.luv2code.springdemo;

public class CricketCoach implements Coach{
	private FortuneService fortuneService;
	private String emailAddress, teamName;
	
	
	
	public CricketCoach(){
		
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String getDailyWorkout(){
		return "Play Cricket everyday";
	}

	@Override
	public String getDailyFortune() {
		return "Your day is super lucky";
	}

}
