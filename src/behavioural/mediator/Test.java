package behavioural.mediator;

public class Test {
    public static void main(String[] args) {
        Airport BenGurionAirport = new Airport();
        boolean planeState[] = {true, false, true, false};

        Airplane[] planes = new Airplane[4];
        for (int i = 0; i < planes.length; i++) {
            planes[i] = new Airplane(BenGurionAirport, i, planeState[i]);
            new Thread(planes[i]).start();
        }
    }
}
