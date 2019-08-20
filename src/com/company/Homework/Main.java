package com.company.Homework;

public class Main {
    public static void main(String[] args) {
       double firstNumber = DoubleInputter.Input();
       double secondNumber = DoubleInputter.Input();

       int[] ints = new int[10];

       double result = Division.Divide(firstNumber, secondNumber);
       System.out.println("Result of division: " + result);

        for(int i = 0; i<10; i++){
            ints[i] = IntInputter.readNumber(1,100);
        }

        System.out.println("You entered these numbers");
        for(int i = 0; i<10; i++){
            System.out.println(ints[i]);
        }

    }
}
