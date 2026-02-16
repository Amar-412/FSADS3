package com.klu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // it helps the application to identify the controller ; 
                 //It returns info in form of JSON format to the end user
                 // It is the combination of @Controller and @request Body
                 // here on the frontend side the data received in the json format is handled by the react which decides how to present the data to the user
public class DemoController {
    
	@GetMapping("/hello") 
	public String sayHello() {
    	 return "Hi, this is my first controller";
     }
}

