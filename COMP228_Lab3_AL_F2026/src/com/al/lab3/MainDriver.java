package com.al.lab3;

// Main class for testing the Hospital Management System
public class MainDriver {

	public static void main(String[] args) {

		// Create a Doctor object
		Doctor doctor = new Doctor(101, "Dr. Smith", 40, "Cardiology", 150.00);
		
		// Calling doctor methods
		System.out.println("\nDoctor Methods:");
		doctor.diagnosePatient();
		doctor.performDuties();
		
		// Create a Nurse object
		Nurse nurse = new Nurse(102, "Sarah", 30, "Emergency", "Night");

		// Call Nurse methods
		System.out.println("\nNurse Methods:");
		nurse.assistPatient();
		nurse.performDuties();
		
		// Create a Surgeon object
		Surgeon surgeon = new Surgeon(103, "Dr. Lee", 45,
				"Cardiology", 200.00, "Heart", 4);

		// Call Surgeon methods
		System.out.println("\nSurgeon Methods:");
		surgeon.performSurgery();
		surgeon.performDuties();
		
		
		// Create an EmergencyDoctor object
		EmergencyDoctor emergencyDoctor = new EmergencyDoctor(104, "Dr. James", 38,
				"Emergency Medicine", 250.00);

		// Call EmergencyDoctor methods
		System.out.println("\nEmergency Doctor Methods:");
		emergencyDoctor.handleEmergency();
		emergencyDoctor.prescribeMedication();
		emergencyDoctor.generateBill();
		emergencyDoctor.performDuties();
		
		// Demonstrate polymorphism using a Person reference
		System.out.println("\nPolymorphism:");

		Person person;

		person = doctor;
		person.performDuties();

		person = nurse;
		person.performDuties();

		person = surgeon;
		person.performDuties();

		person = emergencyDoctor;
		person.performDuties();
		
		
		// Display Doctor details
		System.out.println("\nDoctor Details:");
		doctor.displayDetails();
		System.out.println("Specialization: " + doctor.getSpecialization());
		System.out.println("Consultation Fee: $" + doctor.getConsultationFee());

		// Display Nurse details
		System.out.println("\nNurse Details:");
		nurse.displayDetails();
		System.out.println("Department: " + nurse.getDepartment());
		System.out.println("Shift: " + nurse.getShift());

		// Display Surgeon details
		System.out.println("\nSurgeon Details:");
		surgeon.displayDetails();
		System.out.println("Specialization: " + surgeon.getSpecialization());
		System.out.println("Consultation Fee: $" + surgeon.getConsultationFee());
		System.out.println("Surgery Type: " + surgeon.getSurgeryType());
		System.out.println("Operating Room: " + surgeon.getOperatingRoom());

		// Display EmergencyDoctor details
		System.out.println("\nEmergency Doctor Details:");
		emergencyDoctor.displayDetails();
		System.out.println("Specialization: " + emergencyDoctor.getSpecialization());
		System.out.println("Consultation Fee: $" + emergencyDoctor.getConsultationFee());
	}
}