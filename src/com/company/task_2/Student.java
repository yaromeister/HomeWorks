package com.company.task_2;

public class Student extends Person {
    private String name;

    public Student (String name){
        super(name);
        this.name = name;
    }

    protected void print(){
        System.out.println("I am a Student, and my name is " + this.name);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
