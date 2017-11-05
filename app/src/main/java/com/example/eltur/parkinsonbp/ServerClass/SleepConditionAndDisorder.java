package com.example.eltur.parkinsonbp.ServerClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.lang.String.format;

/**
 * Created by elad on 09/09/2017.
 */

public class SleepConditionAndDisorder {

    private Long sleepConditionID;
    private Long sleepHours;
    private String sleepQuality;
    private List<SleepDisorderUpdate> sleepDisorders = new ArrayList<>();

    public SleepConditionAndDisorder(){
    }

    public SleepConditionAndDisorder(long sleepHours, String sleepQuality, Collection<SleepDisorderUpdate> sleepDisorders){
        this.sleepHours = sleepHours;
        this.sleepQuality = sleepQuality;
        this.sleepDisorders.addAll(sleepDisorders);
    }

    public Long getSleepConditionName() {
        return sleepConditionID;
    }

    @Override
    public String toString(){
        return format("{sleepConditionID:\"%d\",sleepHours:\"%d\",sleepQuality:\"%s\",sleepDisorders:%s}",sleepConditionID,sleepHours,sleepQuality,
               sleepDisorders);
    }

    public Long getSleepConditionID() {
        return sleepConditionID;
    }

    public void setSleepConditionID(Long sleepConditionID) {
        this.sleepConditionID = sleepConditionID;
    }

    public Long getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(Long sleepHours) {
        this.sleepHours = sleepHours;
    }

    public String getSleepQuality() {
        return sleepQuality;
    }

    public void setSleepQuality(String sleepQuality) {
        this.sleepQuality = sleepQuality;
    }

    public List<SleepDisorderUpdate> getSleepDisorders() {
        return sleepDisorders;
    }

    public void setSleepDisorders(List<SleepDisorderUpdate> sleepDisorders) {
        this.sleepDisorders = sleepDisorders;
    }
}
