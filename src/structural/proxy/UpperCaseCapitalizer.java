package structural.proxy;

public class UpperCaseCapitalizer implements Capitalizer {
    @Override
    public String modify(String str) {
        return str.toUpperCase();
    }
}
