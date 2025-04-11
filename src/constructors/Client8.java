package constructors;

public class Client8 {
    static {
        System.out.println("Client8 SIB1");
    }
    static {
        System.out.println("Client8 SIB2");
    }
    public static void main(String[] args) {
        Employee8 emp8 = new Employee8();
        System.out.println("emp8.empId : "+emp8.empId);
        System.out.println("emp8.empName : "+emp8.empName);
    }
}
