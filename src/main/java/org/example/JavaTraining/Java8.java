package org.example.JavaTraining;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

// using method reference method created and apply to add and subtract.
// method and using static method reference created.

interface  MethodInterface {
    int MI(int a , int b);
}


public class Java8 {


    public int Add(int a, int b) {
        return  a +b;
    }

    public int Sub(int a, int b) {
        return a-b;
    }

    public int Mul(int a, int b) {
        return  a*b;
    }

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


        // Stream....
//
//        List<Integer> list = Arrays.asList(1,3,54,67,7,3,2,4,65,7,3,2,1,4,6,78);
//        List<Integer> newList = list.stream()
//                .filter(e -> e%2 == 0)
//                .map(e -> e*2)
//                .map(e-> e - 10)
//                .collect(Collectors.toList());
//        newList.forEach(System.out::print);



        /// reducers gives you sum.

//        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
//        String result = letters
//                .stream()
//                .reduce("", (partialString, element) -> partialString + element);
//        System.out.println(result);
//
//
//        List<Integer> list = Arrays.asList(2,34,5,7,8,89,4,2,45,67,89);
//        int sum = list.stream().mapToInt(i -> i).sum();
//        int average  = sum/list.size();
//        System.out.println(sum);
//        System.out.println(average);


        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);


        List<String> str = new ArrayList<>();
        str.add("Moin MAlik naam h mera.... ");

        str.stream().forEach(System.out::println);


        // min number of a stream...

        List<Integer> list = Arrays.asList(2,3,4,56,7,2,1,1,4,6,8,34,5);

//        Integer min = Stream.of(list).min(Comparator.comparing(Integer::valueOf)).get();
//
//        System.out.println(min);


        // string having leght > 3;

//        List<String> list = Arrays.asList("moin", "malik", "hii");
//
//        long count = list.stream().filter(s -> s.length() > 3).count();
//
//        System.out.println(count);

        // print those strings...
//        list.stream()
//                .filter(s -> s.length() > 3)
//                .forEach(System.out::println);


        // multiple of 3 ...

        List<Integer> list1 = Arrays.asList(34,1,2,45,7,1,6,8,9);

        list1.stream().filter(e -> e%3 ==0).forEach(System.out::println);


        Stream<Integer> stream = list1.stream();
        Stream<Integer> stream1 = list.stream();

        Stream<Integer> stream2 = Stream.concat(stream,stream1);
        stream2.forEach(System.out::println);



        List<Integer> ageList = new ArrayList<>();
        ageList.add(23);
        ageList.add(24);
        ageList.add(30);
        ageList.add(45);

        Collection<Integer> filterAge = ageList.stream().filter(e-> e>23).collect(Collectors.toList());

        System.out.println(filterAge);


    }
}
