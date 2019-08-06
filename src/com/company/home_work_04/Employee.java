package com.company.home_work_04;

public class Employee {
    private String name;
    private int rate;
    private int hours;

    private static int totalHours;

    public Employee()
    {

    }

    public Employee(String name, int rate)
    {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours)
    {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalHours+=hours;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getRate()
    {
        return rate;
    }

    public void changeRate(int rate)
    {
        this.rate = rate;
    }

    public int getHours()
    {
        return hours;
    }

    public void setHours(int hours)
    {
        this.hours = hours;
    }

    public static int getTotalHours() {
        return totalHours;
    }

    public int Salary(int rate, int hours)
    {
        return rate* hours;
    }

    public String toString()
    {
       return "Employee{name: " + name + ", rate: " + rate + ", hours: " + hours;
    }

    public double bonuses(int rate, double percent){
        return rate*percent/100;
    }

}
