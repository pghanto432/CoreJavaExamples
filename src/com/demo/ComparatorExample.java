package com.demo;

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class SortBySalary implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        int val=0;
        if(a.getSalary() == b.getSalary()){
            val = 0;
        } else if(a.getSalary() > b.getSalary()){
            val = 1;
        } else if (a.getSalary() < b.getSalary()){
            val = -1;
        }
        return val;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "John", 45000.0));
        employees.add(new Employee(2, "Mike", 55000.0));
        employees.add(new Employee(3, "Bill", 35000.0));

        System.out.println("Unsorted:");
        System.out.println("############");
        for (Employee e : employees) {
            System.out.println(e.getName() + " " + e.getSalary());
        }

        Collections.sort(employees, new SortBySalary());

        System.out.println("\nSorted by Salary:");
        System.out.println("############");

        for (Employee e : employees) {
            System.out.println(e.getName() + " " + e.getSalary());
        }
    }
}