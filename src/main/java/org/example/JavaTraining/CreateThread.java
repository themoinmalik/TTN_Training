package org.example.JavaTraining;

public class CreateThread {

    public static void main(String[] args) {

        Runnable mythread = () -> {
            Thread.currentThread().setName("my Thread... ");
            String name = Thread.currentThread().getName();
            System.out.println(name + "Running....");
        };

        Thread run = new Thread(mythread);
        run.start();
    }

}
