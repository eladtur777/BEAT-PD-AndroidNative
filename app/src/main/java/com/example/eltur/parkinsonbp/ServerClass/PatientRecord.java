package com.example.eltur.parkinsonbp.ServerClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class PatientRecord {

    private String patientID;
    private String patientLastUpdate;//format yyyy-mm-dd

    public SleepConditionAndDisorder getSleepConditionAndDisorder() {
        return sleepConditionAndDisorder;
    }

    public void setSleepConditionAndDisorder(SleepConditionAndDisorder sleepConditionAndDisorder) {
        this.sleepConditionAndDisorder = sleepConditionAndDisorder;
    }

    private SleepConditionAndDisorder sleepConditionAndDisorder;
    public Collection<ActivityUpdate> getListOfActivityUpdate() {
        return listOfActivityUpdate;
    }

    public void setListOfActivityUpdate(Collection<ActivityUpdate> listOfActivityUpdate) {
        this.listOfActivityUpdate = listOfActivityUpdate;
    }

    private Collection<ActivityUpdate> listOfActivityUpdate = new ArrayList();

    public Collection<MedicineUpdate> getListOfMedicineUpdate() {
        return listOfMedicineUpdate;
    }

    public void setListOfMedicineUpdate(Collection<MedicineUpdate> listOfMedicineUpdate) {
        this.listOfMedicineUpdate = listOfMedicineUpdate;
    }

    //Mprivate Collection<Medicine> listOfMedicineUpdate = new ArrayList();
    private Collection<MedicineUpdate> listOfMedicineUpdate = new ArrayList<>();
    public List<HabitUpdate> getListOfHabitUpdate() {
        return listOfHabitUpdate;
    }

    public void setListOfHabitUpdate(List<HabitUpdate> listOfHabitUpdate) {
        this.listOfHabitUpdate = listOfHabitUpdate;
    }

    private List<HabitUpdate> listOfHabitUpdate = new ArrayList<>();
    private Collection<MoodCondition> listOfMoodCondition = new ArrayList<>();
    private Collection<SleepDisorder> listOfSleepDisorders = new ArrayList<>();
    private SleepCondition sleepCondition ;

    public SleepCondition getSleepCondition() {
        return sleepCondition;
    }

    public void setSleepCondition(SleepCondition sleepCondition) {
        this.sleepCondition = sleepCondition;

    }



    public Collection<SleepDisorder> getListOfSleepDisorders() {
        return listOfSleepDisorders;
    }

    public void setListOfSleepDisorders(Collection<SleepDisorder> listOfSleepDisorders) {
        this.listOfSleepDisorders = listOfSleepDisorders;
    }


    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientLastUpdate() {
        return patientLastUpdate;
    }

    public void setPatientLastUpdate(String patientLastUpdate) {
        this.patientLastUpdate = patientLastUpdate;
    }



    public Collection<MoodCondition> getListOfMoodCondition() {
        return listOfMoodCondition;
    }

    public void setListOfMoodCondition(Collection<MoodCondition> listOfMoodCondition) {
        this.listOfMoodCondition = listOfMoodCondition;
    }



        @Override
    public String toString(){
            return String.format("{patientID:%s,patientLastUpdate:%s,listOfActivityUpdate:%s,listOfMedicineUpdate:%s,listOfHabitUpdate:%s,listOfMoodCondition:%s,sleepConditionAndDisorder:%s}",
                     patientID,patientLastUpdate, listOfActivityUpdate, listOfMedicineUpdate, listOfHabitUpdate, listOfMoodCondition, sleepConditionAndDisorder);

    }

        public PatientRecord(){
        }


}
