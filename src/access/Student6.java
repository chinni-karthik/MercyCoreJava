package access;

public class Student6 {
    boolean status;
    private int rollNo;
    private String studentName;

    void findAverage(){
        System.out.println("from Student6.findAverage()");
    }

    private void findTotal(){
        System.out.println("from Student6.findTotal()");
    }
}

class Client6 extends Student6{
    public static void main(String[] args) {
        Student6 student6 = new Student6();
        System.out.println(student6.status);
//        System.out.println(student6.rollNo);
//        System.out.println(student6.studentName);
        student6.findAverage();
//        student6.findTotal();
    }
}
