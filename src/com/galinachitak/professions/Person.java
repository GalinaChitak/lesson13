package com.galinachitak.professions;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    public String age;
    public String fullName;


    public Person(String age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void driverAge(String age) {
        String[] arr = age.split("\\.");
        StringBuilder reverseDate = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseDate.append(arr[i]).append("-");
        }
        reverseDate.setLength(reverseDate.length() - 1);
        String changedDate = reverseDate.toString();
        LocalDate inputDate = LocalDate.parse(changedDate);
        LocalDate currentDate = LocalDate.now();
        System.out.println("total years: " + Period.between(inputDate, currentDate).getYears());
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
