package structural.bridge;

public class LowerCaseFeature extends PrinterFeature {
    @Override
    public void print(String text) {
        System.out.println(text.toLowerCase());
    }
}
