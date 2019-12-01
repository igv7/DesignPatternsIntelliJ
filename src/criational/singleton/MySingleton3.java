package criational.singleton;

public class MySingleton3 {

    private static class MySingletonHolder {
        public static MySingleton3 instance = new MySingleton3();
    }

    private MySingleton3() {
        System.out.println("CTOR M3 in action");
    }

    public static MySingleton3 getInstance() {
        return MySingletonHolder.instance;
    }


}
