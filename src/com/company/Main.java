package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        Employee[] employees = {new SalariedEmployee("Jack","1","123", 160, 4),
                                new SalariedEmployee("Mary","2","456", 170, 5),
                                new SalariedEmployee("Judith","3","789", 190, 4),
                                new ContractEmployee("David","4", "741", 800),
                                new ContractEmployee("Oscar","5", "852", 650),
                                new ContractEmployee("Freya","6", "963", 497),
                                };

        Arrays.sort(employees, (emp1,emp2)->((Payment)emp2).calculatePay()-((Payment)emp1).calculatePay());

        for(Employee emp : employees)
        {
            System.out.println(((Payment)emp).toString());
        }

    }
}
