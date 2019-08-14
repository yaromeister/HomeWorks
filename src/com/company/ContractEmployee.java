package com.company;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdMember;
    private int monthlyWage;

    public ContractEmployee(String name, String employeeID, String federalTaxIdMember, int monthlyWage){
        super(employeeID, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.monthlyWage = monthlyWage;
    }

    public int calculatePay(){
        return monthlyWage;
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
