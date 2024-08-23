package oopsLevel3;

class Outer {
    static class Inner {
        void show() {
            System.out.println("Inside static inner class");
        }
    }

    void display() {
        Inner inner = new Inner();
        inner.show();
    }
}

public class StaticInnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();

        Outer.Inner inner = new Outer.Inner();
        inner.show();
    }
}

