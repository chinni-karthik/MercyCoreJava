package constructors;

public class Client6 {
    public static void main(String[] args) {
        System.out.println("main() starts");
        Employee6 emp6 = new Employee6();
        System.out.println("emp6.empId = "+emp6.empId);
        System.out.println("emp6.empName = "+emp6.empName);

        System.out.println("============================");

        Employee6 emp66 = new Employee6(100,"Mercy");
        System.out.println("emp66.empId = "+emp66.empId);
        System.out.println("emp66.empName = "+emp66.empName);

        System.out.println("main() ends");
    }
}
