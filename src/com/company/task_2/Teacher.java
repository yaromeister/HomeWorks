package com.company.task_2;

public class Teacher extends Staff {
    private String name;

    public Teacher(String name)
    {
        super(name);
        this.name = name;
    }

    protected void print()
    {
        System.out.println("I am a teacher, and my name is " + this.name);
    }

    protected void salary(){
        System.out.println("Salary of a teacher");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


}
