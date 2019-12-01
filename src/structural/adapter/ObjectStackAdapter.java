package structural.adapter;

public class ObjectStackAdapter implements Stack {

    StackAdaptee stack = new StackAdaptee();

    @Override
    public void add(char c) {
        stack.addElement(c);
    }

    @Override
    public void display() {
        stack.print();
    }
}
