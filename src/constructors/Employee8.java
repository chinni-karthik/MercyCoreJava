package constructors;

public class Employee8 {
    // ctrl+alt+l -> this is for code formatting
    static {
        System.out.println("Employee8 SIB1");
    }

    static {
        System.out.println("Employee8 SIB2");
    }

    // instance variables
    int empId;
    String empName;

    // zero-arg constructor
    public Employee8() {
        this(100);
        System.out.println("Employee8() zero-arg constructor");
    }

    // parameterized constructor
    public Employee8(int empId) {
        this(empId, "Mercy");
        this.empId = empId;
    }

    // parameterized constructor
    public Employee8(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
}
