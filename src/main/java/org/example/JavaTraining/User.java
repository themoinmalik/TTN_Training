package org.example.JavaTraining;

public class User implements Comparable<User>{

    String firstName;
    String lastName;
    int age;

    // constructor...


    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // getter setter...

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        int lastcomp = firstName.compareTo(o.firstName);
        return (lastcomp != 0 ? lastcomp:lastName.compareTo(o.lastName));
    }
}
