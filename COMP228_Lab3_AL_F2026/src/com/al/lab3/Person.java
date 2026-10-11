package com.al.lab3;

//Parent class for hospital employees
public class Person {

	//Stores the person ID, name, and age
	private int personID;
	private String name;
	private int age;

	// Constructor used to initialize a Person object
	public Person(int personID, String name, int age) {

		this.personID = personID;
		this.name = name;
		this.age = age;
	}

	// General hospital duties performed by a person
	public void performDuties() {
		System.out.println("Person is performing hospital duties.");
	}
	
	// Returns the person's ID
	public int getPersonID() {
		return personID;
	}

	// Returns the person's name
	public String getName() {
		return name;
	}

	// Returns the person's age
	public int getAge() {
		return age;
	}
	
	// Displays the person's details
	public void displayDetails() {
		System.out.println("Person ID: " + personID);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}