package com.example.eltur.parkinsonbp.ServerClass;

/**
 * Created by liran on 11/6/17.
 */

public class Patient {

    private String patientID;
    private String patientFirstName;
    private String patientLastName;
    private String patientStatus;
    private String patientAge;
    private String patientPass;

    public Patient() {
    }

    public Patient(String patientID, String patientPass) {
        this.patientID = patientID;
        this.patientPass = patientPass;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getPatientStatus() {
        return patientStatus;
    }

    public void setPatientStatus(String patientStatus) {
        this.patientStatus = patientStatus;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientPass() {
        return patientPass;
    }

    public void setPatientPass(String patientPass) {
        this.patientPass = patientPass;
    }

    @Override
    public String toString(){
        return String.format("{patientID:\"%s\",patientFirstName:\"%s\",patientLastName:\"%s\",patientStatus:\"%s\",patientAge:\"%s\",patientPass:\"%s\"}", patientID, patientFirstName, patientLastName, patientStatus, patientAge,patientPass);
    }
}
