package criational.factoryMethod;

public class Android implements Mobile {

    @Override
    public void display() {
        System.out.println("Android display");
    }

    @Override
    public void button() {
        System.out.println("Android button");
    }
}
