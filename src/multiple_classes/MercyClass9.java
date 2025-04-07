package multiple_classes;

public class MercyClass9 {
    static {
        System.out.println("MercyClass9 static block 1");
    }
    public static void main(String[] args) {
        System.out.println("MercyClass9 main() start");
        MercyClass10.main(null);
        MercyClass10.main(null);
        MercyClass10.main(null);
        MercyClass10.main(null);
        MercyClass10.main(null);
        MercyClass10.main(null);
        MercyClass10.main(null);
        MercyClass10.main(null);
        MercyClass10.main(null);
        MercyClass10.main(null);
        MercyClass10.main(null);
        System.out.println("MercyClass9 main() end");
    }
    static {
        System.out.println("MercyClass9 static block 2");
    }
}

class MercyClass10{
    static {
        System.out.println("MercyClass10 static block 1");
    }
    public static void main(String[] args) {
        System.out.println("MercyClass10 main() start");
        System.out.println("MercyClass10 main() end");
    }
}