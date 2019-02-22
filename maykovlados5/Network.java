package com.gmail.maykovlados5;


import java.util.HashSet;
import java.util.Set;

public class Network {
    private String name;
    private Set<Phone> phoneSet = new HashSet<>();

    public Network(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Phone> getPhoneSet() {
        return this.phoneSet;
    }

    public void setPhoneSet(Set<Phone> phoneSet) {
        this.phoneSet = phoneSet;
    }

    public void addPhone(Phone phone){
        if (this.findNumber(phone.getPhoneNumber())) {
            System.out.println("Number " + phone.getPhoneNumber() + " was registered earlier.");
        }else {
            this.phoneSet.add(phone);
            System.out.println("Number " + phone.getPhoneNumber() + " registered.");
        }
    }

    public boolean findNumber(String number){
        for (Phone phone : phoneSet) {
            if (phone.getPhoneNumber().equals(number)) return true;
        }
        return false;
    }

    public boolean call(Phone phoneOutсoingCall, String number){
        Phone phoneIncomingCall = null;
        for (Phone phone : this.phoneSet) {
            if (phone.getPhoneNumber().equals(number)){
                phoneIncomingCall = phone;
                break;
            }
        }
        if (!this.findNumber(phoneOutсoingCall.getPhoneNumber())){
            System.out.println("Your number '" + phoneOutсoingCall.getPhoneNumber() + "' is no registered! You can't to call anybody!");
            return false;
        }
        if (!this.findNumber(number)){
            System.out.println("You can't call to '" + number + "', it's no registered number!");
            return false;
        }
        if (number.equals(phoneOutсoingCall.getPhoneNumber())){
            System.out.println("You can't to call yourself");
            return false;
        }
        phoneIncomingCall.incomingCall(phoneOutсoingCall.getPhoneNumber());
        return true;
    }
}
