package constructors;

public class Employee3 {
    // instance variable
    int id;
    String name;
    String company;

    public Employee3() {
    }

    public Employee3(int id) {
        this.id = id;
    }

    public Employee3(String name) {
        this.name = name;
    }

    public Employee3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee3(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }
}
