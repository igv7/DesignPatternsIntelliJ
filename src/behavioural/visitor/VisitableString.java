package behavioural.visitor;

public class VisitableString {
    private String value;

    public VisitableString(String value) {
        this.value = value;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
