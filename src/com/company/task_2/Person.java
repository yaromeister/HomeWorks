package com.company.task_2;

public abstract class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    protected abstract void print();
}
