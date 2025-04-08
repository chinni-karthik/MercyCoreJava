package constructors;

public class Employee6 {
    // instance variables
    int empId;
    String empName;

    // zero-arg constructor
    public Employee6() {
        System.out.println("inside zero-arg constructor");
    }

    // parameterized constructor
    public Employee6(int empId) {
        this.empId = empId;
        System.out.println("inside parameterized constructor 1");
    }

    // parameterized constructor
    public Employee6(String empName) {
        this.empName = empName;
        System.out.println("inside parameterized constructor 2");
    }

    // parameterized constructor
    public Employee6(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        System.out.println("inside parameterized constructor 3");
    }
}
