package behavioural.strategy;

public class Sentence {
    private StringBuffer stringBuffer = new StringBuffer();
    private PrintStrategy printStrategy = null;

    public PrintStrategy getPrintStrategy() {
        return printStrategy;
    }

    public void setPrintStrategy(PrintStrategy printStrategy) {
        this.printStrategy = printStrategy;
    }

    public void addWord(String word) {
        stringBuffer.append(word);
    }

    public void print() {
        if (printStrategy == null) {
            System.out.println(stringBuffer.toString());
        } else {
//            addWord(printStrategy.toString());
            printStrategy.print(stringBuffer.toString());
        }
    }
}
