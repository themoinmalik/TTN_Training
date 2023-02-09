package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

interface Calculate {

//    void sum();

//    void sum(int n);

//    int sum(int a, int b);

}

interface Greater {
    boolean greater(int a, int b);
}

interface IncByOne {
    int increment(int a);
}

interface Concat {
    String concatStrings(String a, String b);
}

interface UpperCase {
    String upper(String a);
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

//        List<Integer> list = Arrays.asList(1,2,3,5,7);
//
//        list.stream().forEach(e -> System.out.println(e));


        // predicate....

//        List<Integer> list1 = Arrays.asList(1,2,4,5,7,8,9);
//        list1.stream().filter(i -> i%2 == 0).forEach(i -> System.out.println(i));
//

        // supplier....


//        Supplier<String> supplier = () -> {return "Hello world";};
//

        // stream...
//        List<Integer> list = Arrays.asList();
//
//        System.out.println(list.stream().findAny().orElseGet(() -> {
//            return 2023;
//        }));


    }

}
