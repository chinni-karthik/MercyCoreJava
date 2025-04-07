package constructors;

public class Employee {
    // instance variable
    int id;

    // constructor (no-arg constructor)
    Employee(){
        System.out.println("came into no-arg constructor");
    }

    // parameterized constructor
    public Employee(int id) {
        System.out.println("came into parameterized constructor");
        this.id = id; // this -> current class object
    }
}
