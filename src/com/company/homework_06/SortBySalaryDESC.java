package com.company.homework_06;

import java.util.Comparator;

public class SortBySalaryDESC implements Comparator<Employee> {
    public int compare(Employee a, Employee b){
        return b.getSalary() - a.getSalary();
    }
}
