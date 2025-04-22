package access;

public class Student3 {
    // declaring private instance variable
    private int rollNo;

    // declaring private instance method
    private void findTotal() {
        System.out.println("This is from findTotal() of Student3");
    }
}

class Client{
    public static void main(String[] args) {
        Student3 student3 = new Student3();
//        student3.rollNo = 20;// private access
//        student3.findTotal(); // private access
    }
}
