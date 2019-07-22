package com;

public class BaseballCoach implements Coach{
	
	FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spendung 30 minutes on batting practice";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
