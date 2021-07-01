package com.sports.analysis;

public abstract class Player {
	
	private String name; //variable to store name of the variable
	private int age; //variable to store age of player
	private String country; //variable to store country of player
	
	public Player() {//zero parameter constructor
		
		// TODO Auto-generated constructor stub
	}

	public Player(String name, int age, String country) { //parametrized constructor
		this.name = name;
		this.age = age;
		this.country = country;
	}

	//getters and setters method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
    
	//tostring method
	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", country=" + country + "]";
	}
	

	public abstract void display();
}
