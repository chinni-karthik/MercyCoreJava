package loops;

import java.util.List;

public class ForEachExample2 {
    public static void main(String[] args) {
        List<String> names = List.of("Mercy", "Angel", "Java");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
