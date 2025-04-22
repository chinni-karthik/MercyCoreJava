package access;

public class Student {
    // declare private instance variable
    private int rollNo;

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("this is from access.Student");
        // accessing private instance variable
        System.out.println(student.rollNo);
    }
}
