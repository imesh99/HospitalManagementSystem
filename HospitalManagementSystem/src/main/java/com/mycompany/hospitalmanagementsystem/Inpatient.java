package com.mycompany.hospitalmanagementsystem;

public class Inpatient extends Patient{

    private final String disease;

    public Inpatient(String studentId, String name, int age, String disease) {
        super(studentId, name, age);
        this.disease = disease;
    }

    @Override
    public String getPatientInfo() {
        return "Inpatient: " + getName() + " (ID: " + getPatientId() + ", Age: " + getAge() + ", disease: " + disease + ")";
    }

}

