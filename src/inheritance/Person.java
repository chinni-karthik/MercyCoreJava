package inheritance;

public class Person {
    // instance variables
    String name;
    String dateOfBirth;
    String gender;

    // parameterized constructor
    public Person(String name, String dateOfBirth, String gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    // instance method
    public int findAge(){
        System.out.println("logic to find age");
        return 10;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
