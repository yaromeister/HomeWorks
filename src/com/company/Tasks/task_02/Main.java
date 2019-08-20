package com.company.Tasks.task_02;

public class Main {
    public static void main(String[] args) {

        Plant[] plants = new Plant[5];
        for(int i =0; i<5;i++){
            System.out.println("Input data of the " + (i+1) + " plant");
            Plant plant = PlantDataCapture.Capture();
            plants[i] = plant;
        }

        System.out.println("Results");
        for(Plant plant : plants){
            System.out.println(plant.toString());
        }
    }
}
