package criational.singleton;

public enum MySingletonEnum {
    INSTANCE;
    String name = "Moshe";

    public void sayMyName() {
        System.out.println(name);
    }
}
