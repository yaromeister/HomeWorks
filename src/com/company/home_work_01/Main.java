package com.company.home_work_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Part 1
        System.out.println("\t====Part 1====");

        final double  Pi = 3.14159;
        double radius;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input radius");
        radius = scan.nextInt();
        double result = Pi * 2 * radius;
        System.out.println("Perimeter of the circle = " + result);
        result = Pi * radius * radius;
        System.out.println("Area of the circle = " + result);

        //Part 2
        System.out.println("\t====Part 2====");

        String name;
        byte age;

        System.out.println("What is your name?");
        name = scan.next();
        System.out.println("How old are you?");
        age = scan.nextByte();
        System.out.println("\nYou are " + age + " years old, and your name is " + name);


    }
}
