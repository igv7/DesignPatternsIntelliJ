package structural.facade;

public class BusinessFacade {

    private BusinessA businessA = new BusinessA();
    private BusinessB businessB = new BusinessB();

    public void onlyOne() {
        businessA.function1();
        businessB.function1();
    }

    public void onlyTwo() {
        businessA.function2();
        businessB.function2();
    }

    public void doSomething() {
        businessA.function2();
        businessB.function1();
    }
}
