package com.company.task_1;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Cat("Pickles"),
                            new Cat("Princess"),
                            new Dog("Maggie"),
                            new Dog("Ronnie")};


	    for(int i=0; i<animals.length; i++){
            animals[i].voice();
            animals[i].feed();
            System.out.println("");
        }
    }
}
