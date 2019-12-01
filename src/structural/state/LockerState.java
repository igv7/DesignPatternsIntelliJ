package structural.state;

public abstract class LockerState {
    public abstract void handleLock(LockerContext lockerContext);
    public abstract void handleOpen(LockerContext lockerContext);
}

