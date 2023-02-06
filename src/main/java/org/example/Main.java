package org.example;

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


        Bank.SBI b1 = new Bank.SBI();
        b1.deposit(1000);
        b1.printDetails();
        b1.withDraw(500);
        b1.deposit(3000);
        System.out.println(b1.getBalance());


        System.out.println("-------------------------");

//
        Bank.BOI b2 = new Bank.BOI();
        b2.printDetails();
        b2.deposit(2000);
        b2.withDraw(200);
        System.out.println(b2.getBalance());


        Bank.ICICI b3  = new Bank.ICICI();

        b3.printDetails();


        System.out.println("********************Log file ***********************");
        Bank bank = new Bank();
        bank.fileLogBank(2000,1000);


        CallByValueReference object = new CallByValueReference();


    }
}