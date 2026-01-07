package com.klu.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Car car = (Car)context.getBean("car");  // This is a object creation process without the new keyword and the parameterised constructor is passed with an arguement
    	car.drive();
    
    	Bike bike = (Bike)context.getBean("bike");
    	bike.ride();
    	
    	Engine engine = new Engine();
    	
    }
}
