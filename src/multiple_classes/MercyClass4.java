package multiple_classes;

public class MercyClass4 {
    static int count = 10;
    static int getCount(){
        System.out.println("from MercyClass4 getCount()");
        return 15;
    }
    public static void main(String[] args) {
        System.out.println("MercyClass4 main() method start");
        System.out.println("count = "+count);
        System.out.println("getCount() = "+getCount());
        System.out.println("MercyClass4 main() method end");
        System.out.println("=============================");
        System.out.println("value = "+MercyClass5.value);
        System.out.println("getValue() = "+MercyClass5.getValue());
    }
}

class MercyClass5 {
    static int value = 20;
    static int getValue(){
        System.out.println("from MercyClass5 getValue()");
        return 25;
    }
    public static void main(String[] args) {
        System.out.println("MercyClass5 main() method start");
        System.out.println("MercyClass5 main() method end");
    }
}
