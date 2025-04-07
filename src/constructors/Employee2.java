package constructors;

public class Employee2 {
    // instance variable
    int id;
}

class Client2{
    public static void main(String[] args) {
        Employee2 e2 = new Employee2();
        System.out.println("e2.id = "+e2.id);
    }
}