package oopsLevel3;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

public class SwapDemo {
    static void swap(Employee e1, Employee e2) {
        String temp = e1.name;
        e1.name = e2.name;
        e2.name = temp;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("sahil");
        Employee emp2 = new Employee("belnekar");

        System.out.println("Before Swap:");
        emp1.display();
        emp2.display();

        swap(emp1, emp2);

        System.out.println("After Swap:");
        emp1.display();
        emp2.display();
    }
}
