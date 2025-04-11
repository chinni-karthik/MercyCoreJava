package inheritance;

public class Client {
    public static void main(String[] args) {
        Person person = new Person("Mercy","01-01-2020","Female");
        System.out.println(person);
        System.out.println(person.findAge());

        Employee employee = new Employee("Mercy","01-01-2020","Female",100,true);
        System.out.println(employee);
        System.out.println(employee.findAge());
        System.out.println(employee.findPfDetails());
    }
}
