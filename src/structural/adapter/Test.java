package structural.adapter;

public class Test {
    public static void main(String[] args) {
        StackAdaptee stackAdaptee = new StackAdaptee();
        stackAdaptee.addElement('K');
        stackAdaptee.addElement('o');
        stackAdaptee.addElement('b');
        stackAdaptee.addElement('i');
        stackAdaptee.print();

        ObjectStackAdapter newStackAdapter = new ObjectStackAdapter();
        newStackAdapter.add('I');
        newStackAdapter.add('g');
        newStackAdapter.add('o');
        newStackAdapter.add('r');
        newStackAdapter.display();
    }

}
