package behavioural.visitor;

public class Algorithm2 implements Visitor {

    private String firstLetters ="";

    @Override
    public void visit(VisitableString text) {
        firstLetters += text.getValue().charAt(0) + " ";
    }

    public String getFirstLetters() {
        return firstLetters;
    }
}
