package org.example;

public class CallByValueReference {

    int n = 5;


//    public void change_n(int n) {
//        n = n+5;
//    }


    protected String name = "Moin MAlik";

    public void change_n(CallByValueReference object) {
        object.n = object.n+10;
    }

    private void hello(){
        System.out.println("Hello world");
    }


    public static void main(String[] args) {

        CallByValueReference object = new CallByValueReference();

//        System.out.println("before " + object.n);

//        object.change_n(object.n);   // passing value
//        object.change_n(object);       // call by reference // passing reference...
//
//        System.out.println("after " + object.n);  // printing value of n

        object.hello();



    }

}
