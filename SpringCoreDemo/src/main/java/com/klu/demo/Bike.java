package com.klu.demo;

public class Bike {
     private Engine engine;
     
     public Bike(Engine engine) { // This is also a dependency injection
    	 this.engine=engine;
     }
     /*
      * public void setEngine(Engine engine)  // This is a Setter injection 
      *     this.engine = engine;      
      * }
      */
     
     public void ride() {
    	 engine.start();
    	 System.out.println("The Bike is moving");
     }
}
