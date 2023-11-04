package com.mycompany.hospitalmanagementsystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HospitalManagementSystem {
    private final ArrayList<Patient> patients;

    public HospitalManagementSystem() {
        patients = new ArrayList<>();
    }

    public void addPatients(Patient patient) {
        patients.add(patient);
    }

    public void deletePatient(String patientId) {
        Iterator<Patient> iterator = patients.iterator();
        while (iterator.hasNext()) {
            Patient patient  = iterator.next();
            if (patient .getPatientId().equals(patientId)) {
                iterator.remove();
                System.out.println("Patient with ID " + patientId + " has been deleted.");
                return;
            }
        }
        System.out.println("Patient with ID " + patientId + " not found.");
    }

    public void displayAllPatients() {
        System.out.println("List of Patients:");
        for (Patient patient : patients ) {
            System.out.println(patient.getPatientInfo());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HospitalManagementSystem system = new HospitalManagementSystem();

        while (true) {
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Delete Patient");
            System.out.println("3. Display All Patients");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    String patientId = scanner.next();
                    System.out.print("Enter Patient name: ");
                    String name = scanner.next();
                    System.out.print("Enter Patient age: ");
                    int age = scanner.nextInt();
                    System.out.println("Select Patient type:");
                    System.out.println("1. Inpatient");
                    System.out.println("2. Outpatient");
                    int patientTypeChoice = scanner.nextInt();
                    if (patientTypeChoice == 1) {
                        System.out.print("Enter disease: ");
                        String disease = scanner.next();
                        system.addPatient(new Inpatient(patientId, name, age, disease));
                    } else if (patientTypeChoice == 2) {
                        System.out.print("Enter the disease : ");
                        String disease = scanner.next();
                        system.addPatients(new Outpatient(patientId, name, age, disease));

                    }
                    
                    break;
                case 2:
                    System.out.print("Enter student ID to delete: ");
                    String idToDelete = scanner.next();
                    system.deletePatient(idToDelete);
                    break;
                case 3:
                    system.displayAllPatients();
                    break;
                case 4:
                    System.out.println("Exiting Hospital Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addPatient(Inpatient inpatient) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

    
    
    

