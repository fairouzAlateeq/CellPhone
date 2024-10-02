package com.ps;

public class CellPhone {
    int serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
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

    public static class CellPhoneApplication{
        public static void main(String[] args) {
            CellPhone cellphoney = new CellPhone();
            cellphoney.setSerialNumber(4554653);
            cellphoney.setModel("17 pro max");
            cellphoney.setCarrier("at&t");
            cellphoney.setPhoneNumber("+123456789");
            cellphoney.setOwner("hdhdvlfk");

            System.out.println("Here are the info:\\n " + "Serial is: " + cellphoney.getSerialNumber() + ", " + cellphoney.getCarrier()  +", "+ cellphoney.getPhoneNumber() +cellphoney.getModel() + " " + cellphoney.getOwner());
        }
    }
}