package com.company.Tasks.task_02;

import java.util.Scanner;

public class PlantDataCapture {
    public static Plant Capture(){
        Scanner scan = new Scanner(System.in);
        Plant output = new Plant();
        boolean isValid;

        do {
            try {
                System.out.println("Input size");
                output.setSize(Integer.valueOf(scan.next()));
                isValid = true;
            } catch (Exception e) {
                isValid = false;
                System.out.println("Wrong input, please input numbers");
            }
        }while (!isValid);

        do{
                try {
                    System.out.println("Input color " + java.util.Arrays.asList(Color.values()) );
                    output.setColor(Color.valueOf(scan.next().toUpperCase()));
                    isValid = true;
                }catch (Exception e) {
                    System.out.println("Wrong input, please input one of this colors:" + java.util.Arrays.asList(Color.values()) );
                    isValid = false;
                }
        }while (!isValid);

        do{
            try{
                System.out.println("Input type " +java.util.Arrays.asList(Type.values()));
                output.setType(Type.valueOf(scan.next().toUpperCase()));
                isValid = true;
            }catch (Exception e) {
                System.out.println("Wrong input, please input one of this types:" + java.util.Arrays.asList(Type.values()) );
                isValid = false;
            }

        }while (!isValid);

        return output;
    }
}
