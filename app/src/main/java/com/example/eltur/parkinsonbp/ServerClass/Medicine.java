package com.example.eltur.parkinsonbp.ServerClass;

/**
 * Created by Eltur on 28/05/2017.
 */

public class Medicine {


    private String medicineSerialNumber;


    private String medicineName;


    private String medicineLimitation;


    private String info;

    @Override
    public String toString(){
        return String.format("{medicineSerialNumber:\"%s\",medicineName:\"%s\",medicineLimitation:\"%s\",info:\"%s\"}", medicineSerialNumber, medicineName, medicineLimitation, info);
    }

    public Medicine() {}

    public Medicine(String medicineSerialNumber, String medicineName, String medicineLimitation, String info) {
        this.medicineSerialNumber = medicineSerialNumber;
        this.medicineName = medicineName;
        this.medicineLimitation = medicineLimitation;
        this.info = info;
    }

    public String getMedicineSerialNumber() {
        return medicineSerialNumber;
    }

    public void setMedicineSerialNumber(String medicineSerialNumber) {
        this.medicineSerialNumber = medicineSerialNumber;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineLimitation() {
        return medicineLimitation;
    }

    public void setMedicineLimitation(String medicineLimitation) {
        this.medicineLimitation = medicineLimitation;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }



}



