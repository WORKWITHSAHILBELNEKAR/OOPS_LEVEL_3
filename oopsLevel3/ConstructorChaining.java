package oopsLevel3;

class ConstructorChaining {
    ConstructorChaining() {
        this(20);
        System.out.println("Default Constructor");
    }

    ConstructorChaining(int x) {
        this(10, 30);
        System.out.println("Parameterized Constructor with one argument: " + x);
    }

    ConstructorChaining(int x, int y) {
        System.out.println("Parameterized Constructor with two arguments: " + x + ", " + y);
        System.out.println("Sum: " + (x + y));
    }

    public static void main(String[] args) {
        new ConstructorChaining(11, 12);
    }
}

