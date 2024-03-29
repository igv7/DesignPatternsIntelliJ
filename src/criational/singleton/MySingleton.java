package criational.singleton;

public class MySingleton {
//    private static MySingleton instance = new MySingleton();
//    private static MySingleton instance = null;
    private volatile static MySingleton instance = null;

    private MySingleton() {
        System.out.println("CTOR in action");
    }

    public static MySingleton getInstance() {
        if(instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }
}
