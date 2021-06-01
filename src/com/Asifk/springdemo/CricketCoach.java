package com.Asifk.springdemo;

public class CricketCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	//no-arg constructor 
	public CricketCoach() {
		System.out.println("Inside the no-argument constructor");
	}
	
	public void setFortuneService(FortuneService thefortuneService) {
		System.out.println("inside the setter method");
		this.fortuneService=thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling and cardio to get yourself into shape";
	}
	
	@Override
	public String getDailyFortunes() {
		return this.fortuneService.getFortune();
	}
}
