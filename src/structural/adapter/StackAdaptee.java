package structural.adapter;

import java.util.ArrayList;

public class StackAdaptee {
    private ArrayList<Character> characters = new ArrayList<Character>();

    public void addElement(char c) {
        characters.add(c);
    }

    public void print() {
        System.out.println(characters);
    }
}
