package com.al.lab3;

// Doctor class inherits from Person
public class Doctor extends Person {

	// Doctor-specific attributes
	private String specialization;
	private double consultationFee;

	// Constructor initializes both Person and Doctor attributes
	public Doctor(int personID, String name, int age, String specialization, double consultationFee) {
		super(personID, name, age);
		this.specialization = specialization;
		this.consultationFee = consultationFee;
	}

	// Method for diagnosing a patient
	public void diagnosePatient() {
		System.out.println("Doctor is diagnosing a patient in " + specialization);
	}

	// Overrides the performDuties method from Person
	@Override
	public void performDuties() {
		System.out.println("Doctor is performing medical duties.");
	}
	
	// Returns the doctor's specialization
	public String getSpecialization() {
		return specialization;
	}

	// Returns the doctor's consultation fee
	public double getConsultationFee() {
		return consultationFee;
	}
}