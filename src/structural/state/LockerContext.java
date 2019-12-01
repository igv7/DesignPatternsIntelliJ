package structural.state;

public class LockerContext {
    private LockerState state = null;
    private int combination;

    public LockerContext(LockerState state, int combination) {
        this.state = state;
        this.combination = combination;
    }

    public LockerState getState() {
        return state;
    }

    public void setState(LockerState state) {
        this.state = state;
    }

    public int getCombination() {
        return combination;
    }

    public void setCombination(int combination) {
        this.combination = combination;
    }

    public void lock() {
        state.handleLock(this);
    }

    public void open(int combination) {
        if (this.combination == combination) {
            state.handleOpen(this);
//            System.out.println("Success! Open!");
        } else {
            System.out.println("Wrong Code!");
        }
    }


}
