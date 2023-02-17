package org.example.oops;



abstract class Hello {

    abstract void hello();

}



class Abstraction extends Hello{


    public void hello() {
        System.out.println("Calling from abstract class.... ");
    }


    public static void main(String[] args) {

        Hello obj = new Abstraction();
        obj.hello();



    }

}
