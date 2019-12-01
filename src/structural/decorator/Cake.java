package structural.decorator;

public class Cake extends Item {
    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Cake";
    }
}
