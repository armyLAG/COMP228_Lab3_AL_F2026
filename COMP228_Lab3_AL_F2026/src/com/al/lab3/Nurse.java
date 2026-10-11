package com.al.lab3;

public class Nurse extends Person {

	private String department;
	private String shift;

	public Nurse(int personID, String name, int age, String department, String shift) {
		super(personID, name, age);
		this.department = department;
		this.shift = shift;
	}

	// Method for assisting patient
	public void assistPatient() {
		System.out.println("Nurse from the " + department +
				" department is assisting a patient during the " + shift + " shift.");
	}

	@Override
	public void performDuties() {
		System.out.println("Nurse is performing nursing duties.");
	}
	
	// Returns the nurse's department
	public String getDepartment() {
		return department;
	}

	// Returns the nurse's shift
	public String getShift() {
		return shift;
	}
}