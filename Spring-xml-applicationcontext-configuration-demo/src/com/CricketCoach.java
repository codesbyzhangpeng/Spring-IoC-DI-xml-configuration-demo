package com;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	String emailAddress;
	String team;
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside the setter method!");
		this.fortuneService = fortuneService;
	}
	
	public CricketCoach() {System.out.println("CricketCoach: Inside the default contructor");}

	@Override
	public String getDailyWorkout() {
		return "Just run 10 minutes!";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
