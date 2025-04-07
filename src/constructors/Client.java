package constructors;

public class Client {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println("e1.id = "+e1.id);

        // initializing object state
        e1.id=100;
        System.out.println("e1.id = "+e1.id);

        // initializing object state using constructor
        Employee e2 = new Employee(200);
        System.out.println("e2.id = "+e2.id);
    }
}
