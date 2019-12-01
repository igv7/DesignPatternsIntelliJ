package structural.facade;

public class Test {
    public static void main(String[] args) {
        BusinessFacade businessFacade = new BusinessFacade();
        businessFacade.onlyOne();
        businessFacade.onlyTwo();
        businessFacade.doSomething();
    }
}
