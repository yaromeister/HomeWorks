package com.company.tasks_01;

import java.util.Scanner;
import static java.lang.Math.*;



public class Main {

    public static void main(String[] args) {
        //Task 1
        System.out.println("\t====Task 1====");

        System.out.println("Hello World");

        //Task 2
        System.out.println("\t====Task 2====");

        int a, b;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input values for a and then for b");
        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println("a+b = " + (a+b) + "\na-b = " + (a-b) + "\na*b = " + (a*b) + "\na/b = " + (a/(double)b) );

        //Task 3
        System.out.println("\t====Task 3====");

        String answer;

        System.out.println("How are you?");
        answer = scan.next();
        System.out.println("I'm " + answer);

        //Task 4
        System.out.println("\t====Task 4====");

        int x;

        System.out.println("Input x");
        x = scan.nextInt();
        System.out.println("a^2 = " + pow(x,2) + "\n√x = " + sqrt(x));
    }
}
