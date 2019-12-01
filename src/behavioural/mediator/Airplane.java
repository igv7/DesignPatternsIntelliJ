package behavioural.mediator;

public class Airplane implements Runnable {
    private Airport port;
    private int number;
    private boolean flying;

    public Airplane(Airport port, int number, boolean flying) {
        this.port = port;
        this.number = number;
        this.flying = flying;
    }

    public void run() {
        if (flying) {
            System.out.println("Flight # " + number + " asking permission to land");
            while (!port.permissionToLand()) {
                try {
//                    Thread.sleep((int) (Math.random() * 1000 + 9000));
                    Thread.sleep(10*1000);
                } catch (Exception e) {
                }
            }
            System.out.println("Flight # " + number + " has landed");
        } else {
            System.out.println("Flight # " + number + " asking permission to take off");
            while (!port.permissionToTakeOff()) {
                try {
//                    Thread.sleep((int) (Math.random() * 1000 + 9000));
                    Thread.sleep(10*1000);
                } catch (Exception e) {
                }
            }
            System.out.println("Flight # " + number + " took off");
        }
    }
}
