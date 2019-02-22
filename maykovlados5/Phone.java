package com.gmail.maykovlados5;

public class Phone {
    private String phoneNumber;
    private String model;
    private String imei;

    public Phone(String phoneNumber, String model, String imei) {
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.imei = imei;
    }

    public Phone() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public void incomingCall(String fromPhoneNumber){
        System.out.println("Incoming call to " + this.getPhoneNumber() + " from " + fromPhoneNumber);
    }

    public void outgoingCall(Network network, String toPhoneNumber){
        if (network.call(this, toPhoneNumber)) System.out.println("Outcoming call from " + this.phoneNumber + " to " + toPhoneNumber);;
    }

    public void registration(Network network){
        network.addPhone(this); ;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", model='" + model + '\'' +
                ", imei='" + imei + '\'' +
                '}';
    }
}

