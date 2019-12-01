package structural.state;

public class ClosedLockState extends LockerState {
    @Override
    public void handleLock(LockerContext lockerContext) {
        System.out.println("Already Locked");
    }

    @Override
    public void handleOpen(LockerContext lockerContext) {
        lockerContext.setState(new OpenedLockState());
    }
}
