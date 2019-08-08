package com.company.task_2;

public abstract class Staff extends Person {
    private String name;

    public Staff(String name){
        super(name);
        this.name = name;
    }

    protected void print(){
        System.out.println("I am a Staff, and my name is " + this.name);
    }

    protected abstract void salary();

}
