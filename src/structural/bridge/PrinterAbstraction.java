package structural.bridge;

import java.util.ArrayList;
import java.util.List;

public abstract class PrinterAbstraction {
    protected List<PrinterFeature> features = new ArrayList<PrinterFeature>();

    public PrinterAbstraction() {
        loadFeatures();
    }

    public void printAllFormats(String text) {
        for (PrinterFeature feature: features) {
            feature.print(text);
        }
    }

    protected abstract void loadFeatures();
}
