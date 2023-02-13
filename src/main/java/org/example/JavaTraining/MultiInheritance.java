package org.example.JavaTraining;



interface Hello {
    default void method(){
        System.out.println("hello world... ");
    }
}

class C {
    public void cMethod() {
        System.out.println("Hello from class C");
    }
}


class A implements Hello {

    public void method() {
        System.out.println(" hello from class A");
    }

}

class B implements Hello {

    public void method() {
        System.out.println("HEllo from class B");
    }

}


public class MultiInheritance extends C{

    public static void main(String[] args) {

        A a = new A();
        a.method();

        C c = new C();
        c.cMethod();

    }

}

