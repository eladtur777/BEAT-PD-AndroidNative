package com.example.eltur.parkinsonbp.ServerClass;

import static java.lang.String.format;

/**
 * Created by elad on 09/09/2017.
 */

public class SleepDisorderUpdate {

    private Long sleepDisorderUpdateID;
    private String sleepDisorderName;
    public SleepDisorderUpdate() {}
    public String getName() {
        return sleepDisorderName;
    }

    public void setSleepDisorderName(String sleepDisorderName) {
        this.sleepDisorderName = sleepDisorderName;
    }

    @Override
    public String toString(){
        return format("{sleepDisorderName:\"%s\",sleepDisorderUpdateID:\"%d\"}",sleepDisorderName,sleepDisorderUpdateID);
    }

    public Long getSleepDisorderUpdateID() {
        return sleepDisorderUpdateID;
    }

    public void setSleepDisorderUpdateID(Long sleepDisorderUpdateID) {
        this.sleepDisorderUpdateID = sleepDisorderUpdateID;
    }
}
