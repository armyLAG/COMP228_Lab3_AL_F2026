package com.al.lab3;

// Surgeon class inherits from Doctor class
public class Surgeon extends Doctor {

	// Surgeon-specific attributes
	private String surgeryType;
	private int operatingRoom;

	// Constructor initializes Person, Doctor, and Surgeon attributes
	public Surgeon(int personID, String name, int age, String specialization, double consultationFee,
			String surgeryType, int operatingRoom) {

		super(personID, name, age, specialization, consultationFee);

		this.surgeryType = surgeryType;
		this.operatingRoom = operatingRoom;
	}

	// Method for performing surgery
	public void performSurgery() {
		System.out.println("Surgeon is performing " + surgeryType +
				" surgery in operating room " + operatingRoom + ".");
	}

	// Overrides the performDuties method from Doctor
	@Override
	public void performDuties() {
		System.out.println("Surgeon is performing surgical duties.");
	}
	
	// Returns the type of surgery
	public String getSurgeryType() {
		return surgeryType;
	}

	// Returns the operating room number
	public int getOperatingRoom() {
		return operatingRoom;
	}
}