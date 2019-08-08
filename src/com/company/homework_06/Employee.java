package com.company.homework_06;

public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary)
    {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object otherEmployee){
        if(otherEmployee == null)
            return false;

        if(this == otherEmployee)
            return true;

        Employee other = (Employee) otherEmployee;
        if (name.equals(other.name) && department.equals(other.department) && salary == other.salary)
            return true;

        return false;


    }

}
