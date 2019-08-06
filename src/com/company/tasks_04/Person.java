package com.company.tasks_04;

import java.util.Calendar;

public class Person {

    private String name;
    private int birthYear;


    public Person(){}

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear(){
        return  birthYear;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }


    public int calculateAge(){
        int current_year = Calendar.getInstance().get(Calendar.YEAR);
        return current_year - birthYear;
    }

    public String toString(){
        return "Person {name: " + name + ", age: " + calculateAge() + "}";
    }

    public void info(){
        System.out.println(toString());
    }
}
