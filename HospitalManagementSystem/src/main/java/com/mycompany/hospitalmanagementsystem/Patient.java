package com.mycompany.hospitalmanagementsystem;


public abstract class Patient {
    private final String patientId;
    private final String name;
    private final int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getPatientInfo();

}


