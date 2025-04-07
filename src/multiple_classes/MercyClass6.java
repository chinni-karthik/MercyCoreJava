package multiple_classes;

public class MercyClass6 {
    public static void main(String[] args) {
        System.out.println("MercyClass6 main() start");
        MercyClass7.main(null);
        System.out.println("MercyClass6 main() end");
    }
}

class MercyClass7{
    public static void main(String[] args) {
        System.out.println("MercyClass7 main() start");
        MercyClass6.main(null);
        System.out.println("MercyClass7 main() end");
    }
}