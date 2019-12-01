package structural.decorator;

public class CreamDecorator extends Item {

    private Item currentItem;

    public CreamDecorator(Item item) {
        this.currentItem = item;
    }

    @Override
    public double getCost() {
        return currentItem.getCost() + 1.99;
    }

    @Override
    public String getDescription() {
        return currentItem.getDescription() + " + Cream";
    }
}
