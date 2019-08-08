package com.company.task_1;

public class Cat extends Animal {
    private String name;

    public Cat(String name){
        super(name);
        this.name = name;
    }

    protected void voice(){
        System.out.println("I'm a cat");
    }
    protected void feed(){
        System.out.println("Feed your cat " + this.name);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
