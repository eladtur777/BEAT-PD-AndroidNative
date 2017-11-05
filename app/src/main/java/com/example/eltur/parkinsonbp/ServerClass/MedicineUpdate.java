package com.example.eltur.parkinsonbp.ServerClass;

/**
 * Created by elad on 09/09/2017.
 */

public class MedicineUpdate {

    private Long medicineUpdateID;

    public String getMedicineSerialNumber() {
        return medicineSerialNumber;
    }

    public void setMedicineSerialNumber(String medicineSerialNumber) {
        this.medicineSerialNumber = medicineSerialNumber;
    }

    private String medicineSerialNumber;

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    private String medicineName;

    public String toString(){
        return String.format("{medicineSerialNumber:\"%s\",medicineName:\"%s\"}", medicineSerialNumber, medicineName);
    }

    public MedicineUpdate() {}
}
