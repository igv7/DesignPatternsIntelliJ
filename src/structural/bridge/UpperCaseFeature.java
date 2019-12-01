package structural.bridge;

public class UpperCaseFeature extends PrinterFeature {

    @Override
    public void print(String text) {
        System.out.println(text.toUpperCase());
    }
}
