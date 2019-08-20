package com.company.Tasks.task_01;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputA, inputB;
        int sideA = 1, sideB = 1;
        boolean notInteger = true;
        boolean finished = false;
        do {
            do {
                try {
                    System.out.println("Input first side");
                    inputA = scan.next();
                    sideA = Integer.parseInt(inputA);
                    notInteger = false;
                } catch (Exception ep) {
                    System.out.println("Not a number");
                }
            } while (notInteger);
            do {
                try {
                    System.out.println("Input second side");
                    inputB = scan.next();
                    sideB = Integer.parseInt(inputB);
                    notInteger = false;
                } catch (Exception ep) {
                    System.out.println("Not a number");
                }
            } while (notInteger);

            try {
                System.out.println(squareRectangle(sideA, sideB));
                finished = true;
            } catch (NegativeNumberExeption e) {
                System.out.println(e.getMessage());
            }
        }while(!finished);
    }

    public static int squareRectangle(int sideA, int sideB) throws NegativeNumberExeption{
        if(sideA < 0 || sideB <0){
            throw new NegativeNumberExeption("You entered negative number");
        }else {
            return sideA * sideB;
        }
    }
}
