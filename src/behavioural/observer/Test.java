package behavioural.observer;

public class Test {
    public static void main(String[] args) {
        Channel leviTV = new Channel();

        Subscriber s1 = new Subscriber("Kobi");
        Subscriber s2 = new Subscriber("Igor");
        Subscriber s3 = new Subscriber("Matan");
        Subscriber s4 = new Subscriber("Zamir");
        Subscriber s5 = new Subscriber("Victor");
        Subscriber s6 = new Subscriber("Linoy");

        leviTV.subscribe(s1);
        leviTV.subscribe(s2);
        leviTV.subscribe(s3);
        leviTV.subscribe(s4);
        leviTV.subscribe(s5);
        leviTV.subscribe(s6);


        s1.subscribeToChannel(leviTV);
        s2.subscribeToChannel(leviTV);
        s3.subscribeToChannel(leviTV);
        s4.subscribeToChannel(leviTV);
        s5.subscribeToChannel(leviTV);
        s6.subscribeToChannel(leviTV);

        leviTV.uploadNewContent("Spring Security");
        System.out.println("*******************************");
        leviTV.unSubscribe(s4);
        leviTV.unSubscribe(s6);

        leviTV.uploadNewContent("Angular");

    }
}
