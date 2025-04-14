package inheritance;

public class Dog extends Mammal{
    // instance variable
    String breed;

    // zero-arg constructor
    public Dog() {
        super();
        System.out.println("Dog zero-arg constructor");
    }

    // parameterized constructor
    public Dog(String breed) {
        this();
        this.breed = breed;
        System.out.println("Dog parameterized constructor constructor");
    }
}
