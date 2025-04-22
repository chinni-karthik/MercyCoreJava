package access;

public class Student9 {
    int rollNo;

    private Student9() {
    }

    public Student9(int rollNo) {
        this.rollNo = rollNo;
    }
}

class Client9 {
    public static void main(String[] args) {
//        Student9 student9 = new Student9();
        Student9 student9 = new Student9(100);
    }
}
