package structural.state;

public class OpenedLockState extends LockerState {
    @Override
    public void handleLock(LockerContext lockerContext) {
//        lockerContext.lock();
        lockerContext.setState(new ClosedLockState());
    }

    @Override
    public void handleOpen(LockerContext lockerContext) {
        System.out.println("Already Open");
    }
}
