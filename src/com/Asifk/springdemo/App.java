package com.Asifk.springdemo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create the object
		Coach ch= new BaseballCoach();
		
		Coach trackCoach = new TrackCoach();
		
		//Use the object
		System.out.println(ch.getDailyWorkout());
		System.out.println(trackCoach.getDailyWorkout());
	}

}
