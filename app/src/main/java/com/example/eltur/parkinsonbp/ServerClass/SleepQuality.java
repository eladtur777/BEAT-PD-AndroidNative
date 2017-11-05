package com.example.eltur.parkinsonbp.ServerClass;

import static java.lang.String.format;

/**
 * Created by elad on 18/09/2017.
 */

public class SleepQuality {

    private String sleepQualityName;
    public SleepQuality(){}

    public String getSleepQualityName() {
        return sleepQualityName;
    }

    public void setSleepQualityName(String sleepQualityName) {
        this.sleepQualityName = sleepQualityName;
    }

    @Override
    public String toString(){
        return format("{sleepQualityName:\"%s\"}", sleepQualityName);
    }

}
