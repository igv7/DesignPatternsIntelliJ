package criational.singleton;

public class Test {
    public static void main(String[] args) {

//        MySingleton.getInstance();
//        MySingleton.getInstance();

        Thread t1 = new Thread(() -> MySingleton.getInstance());
        Thread t2 = new Thread(() -> MySingleton.getInstance());
        t1.start();
        t2.start();
//***************************************************************************************************
        MySingleton2.getInstance();
//***************************************************************************************************
        MySingleton3.getInstance();
//***************************************************************************************************

        MySingletonEnum instance1 = MySingletonEnum.INSTANCE;
        instance1.sayMyName();

        instance1.name = "Kobi";
        instance1.sayMyName();


        MySingletonEnum instance2 = MySingletonEnum.INSTANCE;
        instance2.sayMyName();


    }
}
