package com.company;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private int hoursWorked;
    private int hourlyWage;

    public SalariedEmployee(String name, String employeeID, String socialSecurityNumber, int hoursWorked, int hourlyWage){
        super(employeeID, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    public int calculatePay() {
        return hourlyWage*hoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "employeeID='" + employeeID + '\'' +
                ", name='" + name + '\'' +
                ", salary'"+ calculatePay() + '\'' +
                '}';
    }
}
