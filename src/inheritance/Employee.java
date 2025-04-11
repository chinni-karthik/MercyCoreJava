package inheritance;

public class Employee extends Person{
    // instance variables
    int empId;
    boolean isPermanent;

    // parameterized constructor
    public Employee(String name, String dateOfBirth, String gender, int empId, boolean isPermanent) {
        // calling parent constructor
        super(name, dateOfBirth, gender);
        this.empId = empId;
        this.isPermanent = isPermanent;
    }

    public String findPfDetails(){
        System.out.println("logic to find pf details of employee");
        return "PF details of employee";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", isPermanent=" + isPermanent +
                "} " + super.toString();
    }
}
