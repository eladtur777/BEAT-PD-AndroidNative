package com.example.eltur.parkinsonbp.ServerClass;

import java.util.ArrayList;
import java.util.Collection;

import static java.lang.String.format;

/**
 * Created by Eltur on 13/06/2017.
 */

public class SleepCondition {


        private Long sleepConditionID;
        private Long sleepHours;
        private String sleepQuality;

        public SleepCondition(){}

        public SleepCondition(Long i_SleepHours, String i_SleepQuality){
            sleepHours = i_SleepHours;
            sleepQuality = i_SleepQuality;
        }
        @Override
        public String toString(){
            return format("{sleepConditionID:\"%d\",sleepHours:\"%d\",sleepQuality:\"%s\"}",sleepConditionID,sleepHours,sleepQuality);
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
}


