package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionJava {


        public static void main(String[] args) {

                List<Integer> list = new ArrayList<>();

                list.add(34);
                list.add(23);
                list.add(5);
                list.add(3);
                list.add(2);

//                for (Integer e: list) {
//                        System.out.print(e);
//                }

                // using iterators...

//                Iterator<Integer> iter = list.iterator();
//                while (iter.hasNext()) {
//                       Integer e = iter.next();
//                        System.out.println(e);
//                }

                // for each...

//                list.forEach(e -> System.out.println(e));



                // iterate reverse...

//                ListIterator<Integer> iter = list.listIterator(list.size());
//                while (iter.hasPrevious()) {
//                        Integer el = iter.previous();
//                        System.out.println(el);
//                }


                // remove element which are even.

//                int sum = 0;
//
//                Iterator<Integer> iter = list.iterator();
//                while (iter.hasNext()) {
//                        Integer el = iter.next();
//                        sum = sum + el;
//                }
//                System.out.println(sum);


                // searching...

                System.out.println(list.contains(20));
                System.out.println(list.indexOf(34));
                System.out.println(list.lastIndexOf(2));

        }

}
