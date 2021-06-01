package com.Asifk.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach cricketCoach=context.getBean("myCricketCoach", Coach.class);
		
		System.out.println(cricketCoach.getDailyFortunes());
		System.out.println(cricketCoach.getDailyWorkout());
		context.close();
	}

}
