package com.spring.springdapp;

public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do some hardcore dribble practice for 3 hours";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
