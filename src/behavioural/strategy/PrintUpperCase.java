package behavioural.strategy;

public class PrintUpperCase implements PrintStrategy {
    @Override
    public void print(String text) {
        System.out.println(text.toUpperCase());
    }
}
