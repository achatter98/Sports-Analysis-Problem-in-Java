package com.sports.analysis;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		
		String name=""; //local variable to store name
		int age=0; //local variable to store age
		int totalRun=0; //local variable to store total runs
		int totalWickets=0; //local variable to store total wickets
		int totalGoals=0; //local variable to store total goals
		String country=""; //local variable to store country
		
		Player p=null; //super class reference which will point to derived class object
		
		System.out.println("Enter the details of the cricketer such as "+ "Name,age,country,total runs,total wickets");
		
		name=sc.next(); //accepting input from console
		age=sc.nextInt(); 
		country=sc.next();
		totalRun=sc.nextInt();
		totalWickets=sc.nextInt();
		
		p=new Cricketer(name, age, country, totalRun, totalWickets); //upcasting
		System.out.println("Record of the cricketer is as follows:-");
		p.display();
		System.out.println("Total runs scored by"+name+"are: "+((Cricketer)p).getTotalRun()); //downcasting
		
		System.out.println("Enter details for football player such as"+"name,age,country,total goals");
		name=sc.next();
		age=sc.nextInt();
		country=sc.next();
		totalGoals=sc.nextInt();
		
		p=new FootBallPlayer(name, age, country, totalGoals); //upcasting
		p.display(); 
		System.out.println("Total goals made by"+name+"are: "+((FootBallPlayer)p).getTotalGoals()); //downcasting
		

	}

}
