package com.company.homework_06;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        int coutCoincidences = 0;
        Employee maxSalary;
        Employee minSalary;

        Employee[] arr = {new Employee("Jake", "Denver", 1200),
                          new Employee("David", "London", 1500),
                          new Employee("Kate", "Toronto", 1300),
                          new Employee("Denice", "New York", 2000),
                          //new Employee("Alice","Paris", 1400),
                          new Employee("Alice","Paris", 1400)};

        System.out.println("Unsorted");
        for(int i = 0; i <arr.length; i++)
            System.out.println(arr[i].toString());

        Arrays.sort(arr, new SortBySalaryASC());
        System.out.println("\nAscending");
        for(int i = 0; i <arr.length; i++)
            System.out.println(arr[i].toString());

        Arrays.sort(arr, new SortBySalaryDESC());
        System.out.println("\nDescending");
        for(int i = 0; i <arr.length; i++)
            System.out.println(arr[i].toString());

        maxSalary = arr[0];
        minSalary = arr[arr.length-1];


        for (int i =0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    coutCoincidences++;
                }

            }
        }
        System.out.println("\nWe have " + coutCoincidences + " coincidence(s) here");
        System.out.println("\nEmployee with max salary \n" + maxSalary.toString());
        System.out.println("\nEmployee with min salary \n" + minSalary.toString());
    }

}
