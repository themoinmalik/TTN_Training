package org.example;

import java.util.*;

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

//        List<User> users = new ArrayList<>();
//        users.add(new User("Moin","Malik",23));
//        users.add(new User("Baid","Khan",25));
//        users.add(new User("Aakshay","Rawat",20));

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



//        Collections.sort(users);
//
//        users.forEach(user -> {
//            System.out.println("My name is " + user.firstName + user.lastName + " age is " + user.age);
//        });
//
//
//        // sorted by the age...
//
//        Collections.sort(users, Comparator.comparingInt(User::getAge));
//
//
//        users.forEach(user -> {
//            System.out.println("My name is " + user.firstName + " age is " + user.age);
//        });


        // stack...

//        StackCollection stackCollection = new StackCollection(3);
//        stackCollection.push(10);
//        stackCollection.push(20);
//        stackCollection.push(30);
//        stackCollection.display();
//        System.out.println(stackCollection.isFull());
//        stackCollection.pop();
//        stackCollection.display();
//
//        System.out.println(stackCollection.getMin());
//
//        // is empty..
//        System.out.println(stackCollection.isEmpty());

//
//        Greater greater = (a,b) -> a > b;
//        System.out.println(greater.greater(5,1));
//
//
//        IncByOne incByOne = (a) -> a +1;
//        System.out.println(incByOne.increment(5));
//
//
//        Concat concat = (a,b) -> a+b;
//        System.out.println(concat.concatStrings("moin","malik"));
//
//        UpperCase upperCase = (a) -> a.toUpperCase();
//        System.out.println(upperCase.upper("moin malik"));
//
//
//
//        MethodInterface addNum = new Java8()::Add;
//        System.out.println(addNum.MI(2,4));
//
//        MethodInterface subNum = new Java8()::Sub;
//        System.out.println(subNum.MI(8,3));
//
//        MethodInterface mulNum = new Java8()::Mul;
//        System.out.println(mulNum.MI(2,3));



        // Reducers...

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result = letters
                .stream()
                .reduce("", (partialString, element) -> partialString + element);

        System.out.println(result);



    }
}