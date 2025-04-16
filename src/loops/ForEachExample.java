package loops;

public class ForEachExample {
    public static void main(String[] args) {
        // print first 3 numbers -> 1,2,3
        int[] numberArray = {1, 2, 3};
        // for each loop
        for (int num : numberArray) {
            System.out.println(num);
        }
    }
}
