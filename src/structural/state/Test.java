package structural.state;

public class Test {
    public static void main(String[] args) {
        LockerContext myLocker = new LockerContext(new ClosedLockState(), 1234);
        myLocker.open(1234);
        System.out.println(myLocker.getState());

        myLocker.open(1234); //Already Open

        myLocker.lock();
        System.out.println(myLocker.getState());

        myLocker.lock(); //Already Closed
    }
}
