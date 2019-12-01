package structural.decorator;

public class OreoDecorator extends Item {

    private Item currentItem;

    public OreoDecorator(Item item) {
        this.currentItem = item;
    }

    @Override
    public double getCost() {
        return currentItem.getCost() + 2.99;
    }

    @Override
    public String getDescription() {
        return currentItem.getDescription() + " + Oreo";
    }
}
