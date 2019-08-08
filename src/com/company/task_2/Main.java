package com.company.task_2;

public class Main {
    public static void main(String[] args) {

        Person[] persons = {new Student("Jared"),
                            new Student("Alice"),
                            new Teacher("Margaret"),
                            new Teacher("Daniel"),
                            new Cleaner("Jake"),
                            new Cleaner("Nicole")};

        for(int i = 0; i<persons.length;i++)
        {
            persons[i].print();

            if(persons[i] instanceof Staff)
            {
                Staff staff = (Staff)persons[i];
                staff.salary();
            }

            System.out.println();
        }

    }
}
