package structural.bridge;

public class ReverseFeature extends PrinterFeature {
    @Override
    public void print(String text) {
        StringBuilder str = new StringBuilder();
        str.append(text);
        str = str.reverse();
        System.out.println(str);
    }
}
