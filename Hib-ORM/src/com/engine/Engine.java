package com.engine;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.content.Creation;

public class Engine {

	public static void main(String[] args) {
		
		//Calling the Scanner class for IO operations
		Scanner sc = new Scanner(System.in);
		System.out.println("enter model 1 : ");
		
		//giving inputs of the String model object
		String mod1 = sc.nextLine();
		
		System.out.println("enter model 2 : ");
		String mod2 = sc.nextLine();
		
		System.out.println("enter model 3 : ");
		String mod3 = sc.nextLine();
		
		System.out.println("Type enter to log in to db and store data ");
		
		
		
		String confirm = sc.nextLine();
		
		
		
		switch (confirm) {
		case "ok":
	
		
		SessionFactory cars = new Configuration().configure("setup.config.xml").
	    		addAnnotatedClass(Creation.class).
	    		buildSessionFactory();
	    
	    Session auto = cars.getCurrentSession();
	    
	    System.out.println("----Entering the logs----");
	    try {
	    Creation wheels = new Creation(1, mod1, 25,"Lamborghini");
	    Creation wheels2 = new Creation(2,mod2,45, "BMW");
	    Creation wheels3 = new Creation(3,mod3,400,"Nissan");
	    
	    
	    auto.beginTransaction();
	    auto.save(wheels);
	    auto.save(wheels2);
	    auto.save(wheels3);
	    
	    auto.getTransaction().commit();
	    
	    System.out.println("Entries captured");
	}
	finally {
	     cars.close();
	     auto.close();
	       
	
	}
break;

		
		}
	
	/*
	 * else { System.out.println("Goodbye"); sc.close(); }
	 */
	}
}  

