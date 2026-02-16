package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.service.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    @Autowired
        private CalcService service;
    
    // Addition - RequestParam
    //URL: http://localhost:8080/calculcator/add?a=10&b=5  -- the values are passed in the form of key-value pairs
    
    @RequestMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {   // from the front-end the values entered in the text boxes are fetched and given to this method as parameters
		return service.add(a, b);
    }
    	
    // Subtraction - PathVariable
    // URL: http://localhost:8080/calculcator/subtract/20/5 -- here to remove ambiguity of keys , here the keys are removed and only values are sent to the  backend

    @RequestMapping("/subtract/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b) {
    	return service.subtract(a, b);
    }
    
    // Multiplication - PathVariable
    // URL: http://localhost:8080/calculcator/multiply/200/80 -- here to remove ambiguity of keys , here the keys are removed and only values are sent to the  backend

    @RequestMapping("/multiply/{a}/{b}")
    public int multiply(@PathVariable int a, @PathVariable int b) {
    	return service.multiply(a, b);
    }
    
    
    // Division - PathVariable
    // URL: http://localhost:8080/calculcator/division/100/25 -- here to remove ambiguity of keys , here the keys are removed and only values are sent to the  backend

    @RequestMapping("/division/{a}/{b}")
    public double division(@PathVariable int a, @PathVariable int b) {
    	return service.division(a, b);
    }
    
    // Modulo - RequestParam
    // URL: http://localhost:8080/calculcator/modulo?a=25&b=5 -- here to remove ambiguity of keys , here the keys are removed and only values are sent to the  backend

    @RequestMapping("/modulo")
    public int modulo(@RequestParam int a, @RequestParam int b) {   // from the front-end the values entered in the text boxes are fetched and given to this method as parameters
		return service.modulo(a, b);
    }
    
	
}
