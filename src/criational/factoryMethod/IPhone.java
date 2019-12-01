package criational.factoryMethod;

public class IPhone implements Mobile {
    @Override
    public void display() {
        System.out.println("IPhone display");
    }

    @Override
    public void button() {
        System.out.println("IPhone button");
    }
}
