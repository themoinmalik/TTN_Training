package org.example.oops;

class EnA {
    private int a = 10;
}

class EnB {
    int b = 10;
}

class EnC {
    private int c = 10;
}


public class Encapsulated {

    public static void main(String[] args) {

        EnA a = new EnA();
//        a.a;  // a is private tightly encapsulated....

        EnB b = new EnB();
        System.out.println(b.b);    // non-private....

        EnC c = new EnC();
//        c.c;    // c is private  hence tightly encapsulated....


        System.out.println("comimit on feb 17 ... ");


    }


}
