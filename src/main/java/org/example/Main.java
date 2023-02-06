package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InsufficientAmountException {
//        System.out.println("Hello world!");
//
//        String name = "Moin Malik";
//        int age = 23;
//        String designation = "hello worlds";
//
//        Employee emp = new Employee(name, age, designation);
//
//        System.out.println(emp.getAge());
//        System.out.println(emp.getName());
//        emp.setName("Malik Malik");
//        System.out.println(emp.getName());
//        System.out.println(emp.toString());


//        Bank.SBI b1 = new Bank.SBI();
//        b1.deposit(1000);
//        b1.printDetails();
//        b1.withDraw(500);
//        b1.deposit(3000);
//        System.out.println(b1.getBalance());
//
//
//        System.out.println("-------------------------");
//
////
//        Bank.BOI b2 = new Bank.BOI();
//        b2.printDetails();
//        b2.deposit(2000);
//        b2.withDraw(200);
//        System.out.println(b2.getBalance());
//
//
//        Bank.ICICI b3  = new Bank.ICICI();
//
//        b3.printDetails();
//
//
//        System.out.println("********************Log file ***********************");
//        Bank bank = new Bank();
//        bank.fileLogBank(2000,1000);

        List<User> users = new ArrayList<>();
        users.add(new User("Moin","Malik",23));
        users.add(new User("Baid","Khan",25));
        users.add(new User("Aakshay","Rawat",20));

//        users.forEach(user -> {
//            System.out.println("My name is " + user.firstName + user.lastName + " age is " + user.age);
//        });


        // sorting by age...
//        users.sort((user1, user2) -> {
//            return user1.getAge() - user2.getAge();
//        });

        // using comparator. ...
//        users.sort(Comparator.comparingInt(User::getAge));

        //using collection.sort
//        Collections.sort(users,Comparator.comparing(User::getAge));
//
//        users.forEach(user -> {
//            System.out.println("My name is " + user.firstName + " age is " + user.age);
//        });



        Collections.sort(users,Comparator.comparing());



    }
}