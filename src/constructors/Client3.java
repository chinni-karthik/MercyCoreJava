package constructors;

public class Client3 {
    public static void main(String[] args) {
        Employee3 e3 = new Employee3();
        System.out.println("e3.id = "+e3.id);
        System.out.println("e3.name = "+e3.name);
        System.out.println("e3.company = "+e3.company);

        System.out.println("=====================");

        Employee3 e33 = new Employee3(300,"Mercy");
        System.out.println("e33.id = "+e33.id);
        System.out.println("e33.name = "+e33.name);
        System.out.println("e33.company = "+e33.company);

        System.out.println("=====================");

        Employee3 e333 = new Employee3(300,"Mercy", null);
        System.out.println("e333.id = "+e333.id);
        System.out.println("e333.name = "+e333.name);
        System.out.println("e333.company = "+e333.company);
    }
}
