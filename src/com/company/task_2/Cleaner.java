package com.company.task_2;

public class Cleaner extends Staff {
    private String name;

    public Cleaner(String name)
    {
        super(name);
        this.name = name;
    }

    protected void print()
    {
        System.out.println("I am a cleaner, and my name is " + this.name);
    }

    protected void salary(){
        System.out.println("Salary of a cleaner");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


}
