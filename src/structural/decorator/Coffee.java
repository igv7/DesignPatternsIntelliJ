package structural.decorator;

public class Coffee extends Item {
    @Override
    public double getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
