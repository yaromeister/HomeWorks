package com.company.homework_06;

import java.util.Comparator;

public class SortBySalaryASC implements Comparator<Employee> {
    public int compare(Employee a, Employee b){
        return a.getSalary()-b.getSalary();
    }
}
