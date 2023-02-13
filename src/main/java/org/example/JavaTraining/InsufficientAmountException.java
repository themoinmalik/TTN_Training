package org.example.JavaTraining;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;


public class InsufficientAmountException extends  Exception {

    public InsufficientAmountException(String s) {
        super(s);
    }

}

class Bank {

    String name;
    double rateOfInterest;
    double balance = 0.0;
    public enum type {SAVINGS, CURRENT};


    public String getDetails() {
        return "Name " + name + " Rate of interest is " + rateOfInterest;
    }

    public double deposit(int amount) {
        this.balance = this.balance + amount;
        return balance;
    }

    public double getBalance() {
        return  this.balance;
    }

    public double withDraw(int in) throws InsufficientAmountException {

        try {
            if (in > this.balance) {
                throw new InsufficientAmountException("Your balance is " + this.balance);
            } else {
                this.balance = this.balance - in;
            }
        } catch (InsufficientAmountException e) {
            System.out.println(e);
        }

        return balance;

    }

    public void fileLogBank(double balance, double amount) {

        LocalDateTime localDateTime = LocalDateTime.now();
        this.balance = this.balance - amount;

        try {
            FileWriter fileWriter = new FileWriter("logfile.txt");
            fileWriter.write("Time is " + localDateTime + "\n");
            fileWriter.write("amount is " + amount + "\n");
            fileWriter.write("Balance is + "  +balance);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    static class SBI extends Bank {

        public SBI() {
            super.name = "State Bank Of India";
            super.rateOfInterest = 5.4;
        }

        public void printDetails() {
            String str = getDetails();
            System.out.println(str);
        }
    }


    static class BOI extends Bank {

        public BOI() {
            super.name = "Bank Of India";
            super.rateOfInterest = 5;
        }

        public void printDetails() {
            System.out.println(" name is " + name + "rate is " + rateOfInterest);
        }
    }


    static class ICICI extends Bank {

        public ICICI() {
            super.name = "ICICI Bank Of India";
            super.rateOfInterest = 5.5;
        }

        public void printDetails() {
            String str = getDetails();
            System.out.println(str);
        }
    }


}
