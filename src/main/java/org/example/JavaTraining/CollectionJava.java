package org.example.JavaTraining;

import java.util.*;

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

//                System.out.println(list.contains(20));
//                System.out.println(list.indexOf(34));
//                System.out.println(list.lastIndexOf(2));

//                System.out.println(list);

//                list.add(list.size()-1,47);

        // hashmap...

        Map<String, String> map = new HashMap<>();

        map.put("moin", "malik");
        map.put("zaid", "khan");
        map.put("kashan", "khan");
        map.put("asad", "ch");


        System.out.println(map.get("moin"));  // print value...

        Set<Map.Entry<String, String>> setMap = map.entrySet();
        System.out.println(setMap);


        // print all keys...
        Set<String> keys = map.keySet();
        System.out.println("keys are " + keys);


        // print values...
        Collection<String> values = map.values();
        System.out.println("values are " + values);


        // iterating map ...

                Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
                while (iter.hasNext()) {
                        Map.Entry<String,String> entry = iter.next();
                        System.out.println(entry.getKey() + entry.getValue());
                }

                Iterator<Map.Entry<String,String>> iter1 = map.entrySet().iterator();
                iter.forEachRemaining(s -> {
                        System.out.println(s.getKey());
                });


        Map<Employee, Double> employeeDoubleMap = new HashMap<>();
        employeeDoubleMap.put(new Employee("Moin MAlik", 23, "Engineer"), 34000.0);

        System.out.println(employeeDoubleMap);


        // iterate over map using foreach and lambda...
        employeeDoubleMap.forEach((employee, aDouble) -> {
            System.out.println(employee.getName() + aDouble);
        });


        List<User> users = new ArrayList<>();
        users.add(new User("Moin","Malik",23));
        users.add(new User("Baid","Khan",25));
        users.add(new User("Aakshay","Rawat",20));

        users.forEach(user -> {
            System.out.println("My name is " + user.firstName + user.lastName + " age is " + user.age);
        });


        // sorting by age...
        users.sort((user1, user2) -> {
            return user1.getAge() - user2.getAge();
        });

        // using comparator. ...
        users.sort(Comparator.comparingInt(User::getAge));

        //using collection.sort
        Collections.sort(users,Comparator.comparing(User::getAge));
        users.forEach(user -> {
            System.out.println("My name is " + user.firstName + " age is " + user.age);
        });


        Collections.sort(users);
        users.forEach(user -> {
            System.out.println("My name is " + user.firstName + user.lastName + " age is " + user.age);
        });


        // sorted by the age...
        Collections.sort(users, Comparator.comparingInt(User::getAge));

        users.forEach(user -> {
            System.out.println("My name is " + user.firstName + " age is " + user.age);
        });


        // stack...

        StackCollection stackCollection = new StackCollection(3);
        stackCollection.push(10);
        stackCollection.push(20);
        stackCollection.push(30);
        stackCollection.display();
        System.out.println(stackCollection.isFull());
        stackCollection.pop();
        stackCollection.display();

        System.out.println(stackCollection.getMin());
//
//        // is empty..
        System.out.println(stackCollection.isEmpty());


        Greater greater = (a,b) -> a > b;
        System.out.println(greater.greater(5,1));


        IncByOne incByOne = (a) -> a +1;
        System.out.println(incByOne.increment(5));


        Concat concat = (a,b) -> a+b;
        System.out.println(concat.concatStrings("moin","malik"));

        UpperCase upperCase = (a) -> a.toUpperCase();
        System.out.println(upperCase.upper("moin malik"));


        MethodInterface addNum = new Java8()::Add;
        System.out.println(addNum.MI(2,4));

        MethodInterface subNum = new Java8()::Sub;
        System.out.println(subNum.MI(8,3));

        MethodInterface mulNum = new Java8()::Mul;
        System.out.println(mulNum.MI(2,3));


        // Reducers...
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result = letters
                .stream()
                .reduce("", (partialString, element) -> partialString + element);
        System.out.println(result);


    }

}
