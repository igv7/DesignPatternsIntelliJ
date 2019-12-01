package behavioural.visitor;

public class Algorithm1 implements Visitor {
    int counter = 0;
    @Override
    public void visit(VisitableString text) {
        counter += text.getValue().length();
    }

    public int getLettersCounter() {
        return counter;
    }
}
