package org.example.oops;


class Animal {

    void eat() {
        System.out.println("Animals are eating....");
    }
}


class Basics extends Animal{

    public void eat(){
        System.out.println("dogs are eating...");

    }

    public static void main(String[] args) {

        Animal animal = new Basics();
        animal.eat();
    }
}
