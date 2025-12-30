package com.klu;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		//Load configuration and session factory
		
        SessionFactory factory = new Configuration().configure().buildSessionFactory(); // buildSessionFactory is used to establish the connection , configure() get the configuration file
         
        //open session
        Session session = factory.openSession();
        
        //begin transactions
        Transaction tx = session.beginTransaction();
        
        //create object
        Student s= new Student("Amar"); // with this statement the table will be created in the database
        
        
        // save object
        session.save(s);
        
        //commit
        tx.commit();
        
        //close the resources
        
        session.close();
        factory.close();
        
        System.out.println("Data has been inserted successfully");
    
	}

}
