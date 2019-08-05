package com.company.home_work_02;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Part 1
        System.out.println("\t====Part 1====");

        //while(true) {
            System.out.println("Input year");
            int year = scan.nextInt();
            String text = " not";

            if (year % 4 == 0 && ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0) )) {
                text = "";
            }

            System.out.println("It's" + text + " a leap year");
        //}

        //Part 2
        System.out.println("\t====Part 2====");

        System.out.println("Input the number of rows");
        int rows = scan.nextInt();
        int k = 0;

        for(int i = 1; i <= rows; i ++, k = 0)
        {
            for(int space = 1; space<=rows-i; ++space)
            {
                System.out.print(" ");
            }

            while(k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }

            System.out.println();
        }

        //Part 3
        System.out.println("\t====Part 3====");

        System.out.println("Input the number of terms");
        int terms = scan.nextInt();
        double oldSum = 0;
        double newSum;
        double result = 0;

        for(int i = 0; i<terms; i++)
        {
            newSum=pow((double)10,(double)i) + oldSum;
            oldSum=newSum;
            result += newSum;
        }
        System.out.println("Result: " + (int)result);
    }

}
