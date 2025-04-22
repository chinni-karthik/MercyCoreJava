package access;

public class Student2 {
    // declare private instance method
    private void findTotal(){
        System.out.println("This is findTotal() of Student2");
    }

    public static void main(String[] args) {
        System.out.println("this is from access.Student2");
        Student2 student2 = new Student2();
        // accessing private instance method
        student2.findTotal();
    }
}
