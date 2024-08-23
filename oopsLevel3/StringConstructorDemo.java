package oopsLevel3;

class Super {
    String str;

    Super(String str) {
        this.str = str;
    }
}

class Sub extends Super {
    String subStr;

    Sub(String str, String subStr) {
        super(str);
        this.subStr = subStr;
    }

    void display() {
        System.out.println("Super Class String: " + str);
        System.out.println("Sub Class String: " + subStr);
    }
}

public class StringConstructorDemo {
    public static void main(String[] args) {
        Sub sub = new Sub("Hello", "World");
        sub.display();
    }
}

