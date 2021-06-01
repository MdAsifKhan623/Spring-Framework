package com.Asifk.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	public static void main(String [] args) {
		//load the spring the config file
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//retrieve bean from the spring container
		Coach ch= context.getBean("myCoach", Coach.class);
		
//		Coach baseballch= context.getBean("myBaseballCoach", Coach.class);
		
		Coach trackCoach =context.getBean("myTrackCoach",Coach.class);
		
		System.out.println(trackCoach.getDailyFortunes());
		//Call the new method of the FortuneService dependency
		System.out.println(ch.getDailyFortunes());
		
		//call methods on the bean
		System.out.println(ch.getDailyWorkout());
		//close the context
		context.close();
	}

}
