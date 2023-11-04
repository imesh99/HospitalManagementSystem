
package com.mycompany.hospitalmanagementsystem;

public class Outpatient extends Patient {
    private final String disease;

    public Outpatient(String PatientId, String name, int age, String disease) {
        super(PatientId, name, age);
        this.disease = disease;
    }

    @Override
    public String getPatientInfo() {
        return "Outpatient: " + getName() + " (ID: " + getPatientId() + ", Age: " + getAge() + ", disease: " + disease + ")";
    }
}
