package behavioural.strategy;

public class Test {
    public static void main(String[] args) {
        String str = "Learn Strategy Design Patterns in Java 822";
//        System.out.println(str);
//
//        PrintLowerCase lower = new PrintLowerCase();
//        lower.print(str);
//
//        PrintUpperCase upper = new PrintUpperCase();
//        upper.print(str);

        Sentence sentence = new Sentence();
        sentence.addWord("Learn ");
        sentence.addWord("Strategy ");
        sentence.addWord(str);
        sentence.print();

        sentence.setPrintStrategy(new PrintUpperCase());
        sentence.print();

        sentence.setPrintStrategy(new PrintLowerCase());
        sentence.print();

    }
}
