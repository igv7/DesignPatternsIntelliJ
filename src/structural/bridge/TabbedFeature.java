package structural.bridge;

public class TabbedFeature extends  PrinterFeature {
    @Override
    public void print(String text) {
        char[] chars = text.toCharArray();
        for (char ch: chars) {
            System.out.print(ch+"\t");
        }
        System.out.println();
    }
}
