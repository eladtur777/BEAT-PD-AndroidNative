package com.example.eltur.parkinsonbp.ServerClass;

import static java.lang.String.format;

/**
 * Created by Eltur on 12/06/2017.
 */

public class MoodCondition {

    private String moodConditionName;

    public String getMoodConditionName() {
        return moodConditionName;
    }

    public void setMoodConditionName(String moodConditionName) {
        this.moodConditionName = moodConditionName;
    }

    public MoodCondition() {
    }

    @Override
    public String toString(){
        return format("{moodConditionName:\"%s\"}",moodConditionName);
    }
}
