package com.company.home_work_04;

public class Main {

    public static void main(String[] args) {
	Employee emp1 = new Employee("Daniel", 1000, 40);
	Employee emp2 = new Employee("James", 1500, 42);
	Employee emp3 = new Employee("Kyle", 1700, 36);

        System.out.println(Employee.getTotalHours());

    }
}
