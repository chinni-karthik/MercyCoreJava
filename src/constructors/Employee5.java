package constructors;

public class Employee5 {
    // instance variables
    int id;
    String name;
    float  salary;

    // zero-arg constructor
    public Employee5() {
        System.out.println("zero-arg constructor");
    }

    // parameterized constructor
    public Employee5(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // parameterized constructor
    // 'Employee5(int, int, String)' is already defined in 'constructors.Employee5'
    // you get above error if salary is int
    public Employee5(int id, float salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    // parameterized constructor
    public Employee5(float salary, int id, String name) {
        this.salary = salary;
        this.id = id;
        this.name = name;
    }
}
