package com.spring.springdapp;

public class BaseballCoach implements Coach{
	
	// define a private field
	private FortuneService fortuneService;
	
	// define a constructor foe dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on battlng practice";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
