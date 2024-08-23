package oopsLevel3;

interface Shape {
    void input();
    double area();
}

class Circle implements Shape {
    private double radius;

    @Override
    public void input() {
        radius = 5.0;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length, width;

    @Override
    public void input() {
        length = 4.0;
        width = 3.0;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.input();
        System.out.println("Area of Circle: " + circle.area());

        Shape rectangle = new Rectangle();
        rectangle.input();
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}

