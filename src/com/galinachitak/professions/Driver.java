package com.galinachitak.professions;

public class Driver extends Person {

    private final int experience;


    public Driver(String age, String fullName, int experience) {
        super(age, fullName);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                "} " + super.toString();
    }
}



