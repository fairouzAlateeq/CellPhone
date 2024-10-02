package com.ps;

public class CellPhone {
    int serialNumber = 0;
    String model = "";
    String carrier = "";
    String phoneNumber = "";
    String owner = "";

    public CellPhone() {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String modelName) {
        this.model = modelName;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int sn) {
        this.serialNumber = sn;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrierName) {
        this.carrier = carrierName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phn) {
        this.phoneNumber = phn;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String ownerName) {
        this.owner = ownerName;
    }

    public class CellPhoneApplication {

        public static void main(String[] args) {
            CellPhone cellphoney = new CellPhone();
            cellphoney.setSerialNumber(4554653);
            cellphoney.setModel("17 pro max");
            cellphoney.setCarrier("at&t");
            cellphoney.setPhoneNumber("+123456789");
            cellphoney.setOwner("hdhdvlfk");

            System.out.println("Here are the info:\\n " + "Serial is: " + cellphoney.getSerialNumber() + ", " + cellphoney.getCarrier()  +", "+ cellphoney.getPhoneNumber());
        }
    }
}