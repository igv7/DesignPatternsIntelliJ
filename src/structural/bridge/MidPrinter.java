package structural.bridge;

public class MidPrinter extends PrinterAbstraction {
    @Override
    protected void loadFeatures() {
        features.add(new UpperCaseFeature());
        features.add(new LowerCaseFeature());
        features.add(new ReverseFeature());
    }
}
