package com.company.tasks_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Task 1
        System.out.println("\t====Task 1====");

        int n;
        System.out.println("Input m");
        int m = scan.nextInt();

        if(m > 0)
        {
            n = 1;
        }else if(m == 0)
        {
            n = 0;
        }else
        {
            n = -1;
        }

        System.out.println("n = " + n);

        //Task 2
        System.out.println("\t====Task 2====");

        System.out.println("Input number (even or odd)");
        int number = scan.nextInt();

        if(number%2==0)
        {
            System.out.println("You entered and even number");
        }
        else
        {
            System.out.println("You entered and odd number");
        }

        //Task 3
        System.out.println("\t====Task 3====");

        System.out.println("Input number (positive/negative)");
        number = scan.nextInt();

        if(number > 0)
        {
            System.out.println("It's positive");
        }else if( number < 0)
        {
            System.out.println("It's negative");
        }else
        {
            System.out.println("Looks like zero");
        }

        //Task 4
        System.out.println("\t====Task 4====");

        int sum = 0;
        int product = 1;

        for(int i = 1; i<11; i++)
        {
            sum += i;
            product *=i;
        }

        System.out.println("Sum = " + sum + "\nProduct = " + product);

        //Task 5
        System.out.println("\t====Task 5====");


        System.out.println("Input size of the figure");
        int size = scan.nextInt();
        for(int i = 1; i <= size; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
