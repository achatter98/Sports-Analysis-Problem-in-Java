package com.sports.analysis;

public class Cricketer extends Player{
	
	private int totalRun; //variable to store total runs of cricketer
	private int totalWickets; //variable to store total wickets of cricketer
	
	public Cricketer() { //zero parameter constructor
		
		// TODO Auto-generated constructor stub
	}
    
	//parametrized constructor
	public Cricketer(String name,int age,String country,int totalRun, int totalWickets) {
		
		super(name,age,country);//call to super class to initizlize super class data members
		this.totalRun = totalRun;
		this.totalWickets = totalWickets;
	}
    
	//getters and setters
	public int getTotalRun() {
		return totalRun;
	}

	public void setTotalRun(int totalRun) {
		this.totalRun = totalRun;
	}

	public int getTotalWickets() {
		return totalWickets;
	}

	public void setTotalWickets(int totalWickets) {
		this.totalWickets = totalWickets;
	}

	
	
	@Override
	public String toString() {
		return "Cricketer [totalRun=" + totalRun + ", totalWickets=" + totalWickets + "]";
	}
    
	//overriding form of method
	@Override
	public void display() {
		System.out.println(this.toString());
		
	}
	
	
	
	
	
	
	
	

}
