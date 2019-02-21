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

    public void callTo(String phoneNumber) {
        if (Network.findNumber(phoneNumber) && Network.findNumber(this.phoneNumber)) {

            if (!this.phoneNumber.equals(phoneNumber)) {
                System.out.println("Outcoming call from " + this.phoneNumber + " to " + phoneNumber);
                System.out.println(incomingCall(this.phoneNumber, phoneNumber));
            } else System.out.println("You can't to call yourself");

        } else if (!Network.findNumber(phoneNumber) && !Network.findNumber(this.phoneNumber)) {
            System.out.println("Unreal operation!");
        } else if (!Network.findNumber(phoneNumber)) {
            System.out.println("You can't call to '" + phoneNumber + "', it's no registered number!");
        } else if (!Network.findNumber(this.phoneNumber)) {
            System.out.println("Your number '" + this.phoneNumber + "' is no registered! You can't to call anybody!");
        }
    }

    private static String incomingCall(String fromPhoneNumber, String toPhoneNumber ){
            return "Incoming call to " + toPhoneNumber + " from " + fromPhoneNumber;
    }

    public void registration(){
       Network.addNumber(this.phoneNumber) ;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", model='" + model + '\'' +
                ", imei='" + imei + '\'' +
                ", registered='" + Network.findNumber(this.phoneNumber) + '\'' +
                '}';
    }
}

