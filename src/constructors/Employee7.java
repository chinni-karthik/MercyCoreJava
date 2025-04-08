package constructors;

public class Employee7 {
    // instance variables
    int empId;
    String empName;

    // zero-arg constructor
    public Employee7() {
        //Call to 'this()' must be first statement in constructor body
        //System.out.println("inside zero-arg constructor");
        //this calling statement
        this(250,"John");
    }

    public Employee7(int empId, String empName) {
        //Recursive constructor invocation
        //this();
        this.empId = empId;
        this.empName = empName;
    }
}
