package com.Asifk.springdemo;

public class TrackCoach implements Coach {

	//define the private field for the dependency
	public FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
		
	}

	@Override
	public String getDailyWorkout() {
		return "Run as long as 7 Miles";
	}

	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		return "Find Track coach and return the fortune"+fortuneService.getFortune();
	}

}
