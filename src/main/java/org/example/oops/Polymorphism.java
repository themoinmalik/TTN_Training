package org.example.oops;


class Shape {
    public void area() {
        System.out.println("the area is Shape....");
    }
}

class Circle extends  Shape {

    public void area(){
        System.out.println("the area of  circle is 3.14*r*r");
    }

}

public class Polymorphism  {

    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.area();

        Circle c = new Circle();
        c.area();

    }
}
