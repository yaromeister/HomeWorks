package com.company.Homework;

import java.util.Scanner;

public class IntInputter {
    public static int readNumber(int start, int end){
        Scanner scan = new Scanner(System.in);
        int input = 0;
        boolean isCorrectInput = false;
        System.out.println("Input integer number");
        do {
            try {
                input = Integer.valueOf(scan.next());
                if(input<end && input>start){
                    isCorrectInput = true;
                }
                else {
                    throw new OutOfGivenRangeExeption("This number doesn't fit in given range");
                }
            } catch (OutOfGivenRangeExeption ex){
                System.out.println(ex.getMessage());

            }
            catch (Exception e) {
                System.out.println("Not a number");
            }
        }while(!isCorrectInput);
        return input;
    }
}
