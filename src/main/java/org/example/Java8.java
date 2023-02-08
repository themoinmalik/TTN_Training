package org.example;


import java.util.Arrays;
import java.util.List;

interface Calculate {

//    void sum();

//    void sum(int n);


    int sum(int a, int b);

}

public class Java8 {

    public static void main(String[] args) {

        // forEach...


        /// lambda Expression...
//
//        Calculate calculate = () -> {
//            System.out.println("sum is = 10");
//        };

//        calculate.sum();


        // parameterised...

//        Calculate calculate = (n) -> {
//            System.out.println("sum is "  + n);
//        };
//        calculate.sum(23);


        // return type...

//        Calculate calculate = (a,b) -> {
//            return a+b;
//        };
//        System.out.println(calculate.sum(2,5));



        // consumer type....

        List<Integer> list = Arrays.asList(1,2,3,5,7);

        list.stream().forEach(e -> System.out.println(e));





    }


}
