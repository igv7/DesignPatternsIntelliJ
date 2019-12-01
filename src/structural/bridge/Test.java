package structural.bridge;

public class Test {
    public static void main(String[] args) {
        System.out.println("*********************RegularPrinter***********************");
        RegularPrinter regularPrinter = new RegularPrinter();
        regularPrinter.printAllFormats("Moshe");
        System.out.println("*********************MidPrinter***********************");
        MidPrinter midPrinter = new MidPrinter();
        midPrinter.printAllFormats("Moshe");
        System.out.println("*********************DeluxePrinter***********************");
        DeluxePrinter deluxePrinter = new DeluxePrinter();
        deluxePrinter.printAllFormats("Moshe");
    }
}
