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


//class MultiInheritance extends A,B{    // not allowed. multi inheritance...

class MultiInheritance {
    public static void main(String[] args) {

        A a = new A();
        a.method();

    }
}
