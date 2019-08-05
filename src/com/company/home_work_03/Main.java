package com.company.home_work_03;

import java.util.Scanner;

public class Main {

    public enum Continents {Europea, Asia, Africa, Australia, NorthAmerica, SouthAmerica, Antarctica}


    public static void main(String[] args) {
	    //Task 1
        System.out.println("\t====Task 1 ====");

        Continents continent = null;
        Scanner scan = new Scanner(System.in);

        boolean isAsking = true;

        while(isAsking) {
            System.out.println("Enter Country");
            String country = scan.nextLine();
            switch (country.toLowerCase()) {
                case "europe":
                    continent = Continents.Europea;
                    isAsking =false;
                    break;
                case "asia":
                    continent = Continents.Asia;
                    isAsking =false;
                    break;
                case "africa":
                    continent = Continents.Africa;
                    isAsking =false;
                    break;
                case "australia":
                    continent = Continents.Australia;
                    isAsking =false;
                    break;
                case "north america":
                    continent = Continents.NorthAmerica;
                    isAsking =false;
                    break;
                case "south america":
                    continent = Continents.SouthAmerica;
                    isAsking =false;
                    break;
                case "antarctica":
                    continent = Continents.Antarctica;
                    isAsking =false;
                    break;
                default:
                    System.out.println("Incorect country, try again");
            }
        }

        System.out.println(continent + "n contries, etc. etc.");


        //Task 2
        System.out.println("\t====Task 2 ====");
        int max = 0, i =0;
        int positive = 0;
        int negative = 0;
        int sum = 0;

        int[] array = new int[10];

        for(i = 0; i<array.length; i++)
        {
            array[i] = scan.nextInt();
        }

        for(i=0; i<array.length; i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
            if(array[i]>=0)
            {
                sum+=array[i];
                positive++;
            }
            if(array[i]<0)
            {
                negative++;
            }
        }

        if(positive>negative)
        {
            System.out.println("More positive");
        }else if(positive < negative)
        {
            System.out.println("More negative");
        }else
        {
            System.out.println("Equal");
        }

        System.out.println("Sum = " + sum);
        System.out.println("Max = " + max);
    }
}
