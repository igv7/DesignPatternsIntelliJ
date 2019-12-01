package structural.bridge;

public class DeluxePrinter extends PrinterAbstraction {
    @Override
    protected void loadFeatures() {
        features.add(new UpperCaseFeature());
        features.add(new LowerCaseFeature());
        features.add(new ReverseFeature());
        features.add(new TabbedFeature());
    }
}
