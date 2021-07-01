package com.sports.analysis;

public class FootBallPlayer extends Player {
	
	private int totalGoals; //variable to store total goals of football player

	public FootBallPlayer() { //zero parameter constructor
		super();
		
	}

	public FootBallPlayer(String name, int age, String country,int totalGoals) { //parametrized constructor
		super(name, age, country);
		
		this.totalGoals=totalGoals;
	}
    
	//getters and setters
	public int getTotalGoals() {
		return totalGoals;
	}

	public void setTotalGoals(int totalGoals) {
		this.totalGoals = totalGoals;
	}

	@Override
	public String toString() {
		return "FootBallPlayer [totalGoals=" + totalGoals + "]";
	}

	@Override
	public void display() {
		
		System.out.println(this.toString());
		
	}
	
	
	
	
	

}
