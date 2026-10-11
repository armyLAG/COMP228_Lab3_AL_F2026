package com.al.lab3;

public class EmergencyDoctor extends Doctor implements  MedicalProfessional, Billable{

	public EmergencyDoctor(int personID, String name, int age, String specialization, double consultationFee) {
		super(personID, name, age, specialization, consultationFee);
	}
	
	// Method for handling emergency situations
	public void handleEmergency() {
		System.out.println("Emergency doctor is handling an emergency.");
	}
	
	// Implements the MedicalProfessional interface
	@Override
	public void prescribeMedication() {
		System.out.println("Emergency doctor is prescribing medication.");
	}

	// Implements the Billable interface
	@Override
	public void generateBill() {
		System.out.println("Emergency doctor is generating a bill.");
	}
	
	// Overrides the performDuties method from Doctor
	@Override
	public void performDuties() {
		System.out.println("Emergency doctor is handling emergency duties.");
	}
	
}
