package behavioural.visitor;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        VisitableString vs1 = new VisitableString("Learn");
        VisitableString vs2 = new VisitableString("Design Patterns");
        VisitableString vs3 = new VisitableString("With Kobi");
        VisitableString vs4 = new VisitableString("Love Java!");

        ArrayList<VisitableString> words = new ArrayList<>();
        words.add(vs1);
        words.add(vs2);
        words.add(vs3);
        words.add(vs4);

        Algorithm1 algorithm1 = new Algorithm1();
        for (VisitableString word: words) {
            word.accept(algorithm1);
        }
        System.out.println(algorithm1.getLettersCounter());

        Algorithm2 algorithm2 = new Algorithm2();
        for (VisitableString word: words) {
            word.accept(algorithm2);
        }
        System.out.println(algorithm2.getFirstLetters());

    }

}