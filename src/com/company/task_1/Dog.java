package com.company.task_1;

public class Dog extends Animal {
    private String name;

    public Dog(String name){
        super(name);
        this.name = name;
    }

    protected void voice(){
        System.out.println("I'm a dog");
    }
    protected void feed(){
        System.out.println("Feed your dog " + this.name);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
