package org.example;



interface Calculate {

    void sum();

}

public class Java8 {

    public static void main(String[] args) {

        // forEach...


        /// lambda Expression...

        Calculate calculate = () -> {
            System.out.println("sum is = 10");
        };

        calculate.sum();


    }


}
