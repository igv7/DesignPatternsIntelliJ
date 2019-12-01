package structural.bridge;

public class RegularPrinter extends PrinterAbstraction {
    @Override
    public void loadFeatures() {
        features.add(new ReverseFeature());
        features.add(new TabbedFeature());
    }
}
