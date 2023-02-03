package org.example;

import java.util.Scanner;

public class Java1 {

//
//    static String firstName;
//    static String lastName;
//    static int age;
//
//
//    static {
//        System.out.println("static block is running...");
//        firstName = "Moin";
//        lastName = "Malik";
//        age = 23;
//    }
//
//    // static methods..
//
//    static void printFirstName() {
//        System.out.println(firstName);
//    }
//    static void printLastName() {
//        System.out.println(lastName);;
//    }
//
//
//    public static void main(String[] args) {
//
//        printFirstName();
//        printLastName();
//
//    }


    // QUES2 till xcode...

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder str = new StringBuilder();  // not having fixed length.
//        System.out.println("enter text");
//        String in = sc.nextLine();
//        while (!in.equals("XCODE")){
//            str.append(in);
////            str.append(" ");
//            in = sc.nextLine();
//        }
//        System.out.println(str);
//    }


    // ques3


//    static {
//        System.out.println("***************MENU****************");
//        System.out.println("1. Calculate Area ");
//        System.out.println("2. Calculate curcumference ");
//        System.out.println("3. EXIT");
//    }
//
//    public static void main(String[] args) {
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter choice... ");
//        int in = sc.nextInt();
//        System.out.println("Enter length= ");
//        int a = sc.nextInt();
//        System.out.println("Enter height");
//        int b = sc.nextInt();
//
//        switch (in) {
//
//            case 1:
//                findArea(a,b);
//                break;
//            case 2:
//                findCircumference(a,b);
//                break;
//            default:
//                break;
//
//        }
//
//    }
//
//    public static void findArea(int a, int b) {
//        int c =  a*b;
//        System.out.println("the Area is =" + c);
//    }
//
//    public static void findCircumference(int a, int b) {
//
//        int c = 2*a + b;
//        System.out.println("The circumference is  " + c);
//    }


    // ques 4...


    public static void main(String[] args) {

        int[][] arr1 = new int[2][2];
        arr1[0][0] = 23;
        arr1[0][1] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 9;

        int row = arr1.length;
        int col = arr1.length;

        System.out.println(arr1.length);

        int sum= 0;

        for (int i = 0;i<arr1.length;i++) {
            for (int j = 0;j< arr1.length;j++) {
                sum = sum + arr1[i][j];
            }
        }
        System.out.println(sum);

    }

}
