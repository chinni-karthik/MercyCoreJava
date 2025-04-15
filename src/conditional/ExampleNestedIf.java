package conditional;

public class ExampleNestedIf {
    public static void main(String[] args) {
        int number = 500;
        System.out.println("Program Starts!");
        if (number > 0) {
            System.out.println("Positive Number!");
            if (number > 100) {
                System.out.println("Number greater than 100");
            }
        }
        System.out.println("Program Ends!");
    }
}
