package com.Asifk.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	public static void main(String [] args) {
		//load the spring the config file
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//retrieve bean from the spring container
		Coach ch= context.getBean("myCoach", Coach.class);
		
		Coach baseballch= context.getBean("myBaseballCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(ch.getDailyWorkout());
		System.out.println(baseballch.getDailyWorkout());
		//close the context
		context.close();
	}

}
