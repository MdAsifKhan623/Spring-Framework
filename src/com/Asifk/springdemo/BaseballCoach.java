package com.Asifk.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do Tennis Rallies and Practice Daily.";
	}

	@Override
	public String getDailyFortunes() {
		
		//use my fortuneService to get fortune 
		return fortuneService.getFortune();
	}

}
