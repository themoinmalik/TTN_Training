package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String name = "Moin Malik";
        int age = 23;
        String designation = "hello worlds";

        Employee emp = new Employee(name, age, designation);

        System.out.println(emp.getAge());
        System.out.println(emp.getName());
        emp.setName("Malik Malik");
        System.out.println(emp.getName());
        System.out.println(emp.toString());

    }
}