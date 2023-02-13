package org.example.oops;




class A {

    public void method(){
        System.out.println("hello from class A");
    }

}


class B {
    public void method() {
        System.out.println("Hello from class B");
    }
}


public class MultiInheritance extends A,B {    // not allowed. multi inheritance...


    public static void main(String[] args) {

    }


}
