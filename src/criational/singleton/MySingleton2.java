package criational.singleton;

public class MySingleton2 {

    private static final MySingleton2 instance = new MySingleton2();

    private MySingleton2() {
        System.out.println("CTOR M2 in action");
    }

    public static MySingleton2 getInstance() {
        return instance;
    }
}
