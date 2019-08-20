package com.company.Homework;

import java.util.Scanner;

public class DoubleInputter {

    public static double Input(){
        Scanner scan = new Scanner(System.in);
        double input = 0;
        boolean isCorrectInput = false;
        System.out.println("Input double number");
        do {
            try {
                input = Double.valueOf(scan.next());
                isCorrectInput = true;
            } catch (Exception e) {
                System.out.println("Not a number");
            }
        }while(!isCorrectInput);
        return input;
    }
}
