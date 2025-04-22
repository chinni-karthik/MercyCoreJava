package access;

public class Student7 {
    private Student7() {
        System.out.println("in zero-arg constructor of Student7");
    }

    public static void main(String[] args) {
        Student7 student7 = new Student7();
    }
}
