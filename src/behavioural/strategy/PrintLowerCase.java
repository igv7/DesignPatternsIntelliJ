package behavioural.strategy;

public class PrintLowerCase implements PrintStrategy {
    @Override
    public void print(String text) {
        System.out.println(text.toLowerCase());
    }
}
