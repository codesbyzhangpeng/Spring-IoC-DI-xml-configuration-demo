package com;

public class TrackCoach implements Coach {
	
	FortuneService fortuneService;
	TrackCoach() {}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
