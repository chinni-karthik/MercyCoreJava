package access;

public class Student5 {
    boolean status;
    private int rollNo;
    private String studentName;
}

class Client5 extends Student5 {
    public static void main(String[] args) {
        Student5 student5 = new Student5();
        System.out.println(student5.status);
//        System.out.println(student5.rollNo);
//        System.out.println(student5.studentName);
    }
}
