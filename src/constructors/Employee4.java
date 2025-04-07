package constructors;

public class Employee4 {
    // instance variables
    int id;
    String name;
    String company;

    // zero-arg constructor
    public Employee4() {
        System.out.println("zero-arg constructor");
    }

    // parameterized constructor
//    public Employee4(int id, String name, String company) {
//        this.id = id;
//        this.name = name;
//        this.company = company;
//    }

    // parameterized constructor
    //'Employee4(int, String, String)' is already defined in 'constructors.Employee4'
    public Employee4(int id, String company, String name) {
        this.id = id;
        this.company = company;
        this.name = name;
    }
}
