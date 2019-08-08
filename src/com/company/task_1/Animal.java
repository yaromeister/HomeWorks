package com.company.task_1;

public abstract class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }
    protected abstract void voice();
    protected abstract void feed();


}
