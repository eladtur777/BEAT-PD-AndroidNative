package com.example.eltur.parkinsonbp.ServerClass;

import static java.lang.String.format;

/**
 * Created by Eltur on 13/06/2017.
 */

public class SleepDisorder {


    private String sleepDisorderName;

    public SleepDisorder() {}

    public String getSleepDisorderName() {
        return sleepDisorderName;
    }

    public void setSleepDisorderName(String sleepDisorderName) {
        this.sleepDisorderName = sleepDisorderName;
    }

    @Override
    public String toString(){
        return format("{sleepDisorderName:\"%s\"}",sleepDisorderName);
    }
}
