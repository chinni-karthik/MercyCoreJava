package conditional;

public class ExampleIfElse2 {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("Program Starts!");
        if (number > 0) {
            System.out.println("Positive Number!");
        } else if (number < 0) {
            System.out.println("Negative Number!");
        } else {
            System.out.println("Number is Zero!");
        }
        System.out.println("Program Ends!");
    }
}
