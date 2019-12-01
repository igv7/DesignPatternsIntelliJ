package behavioural.observer;

public class Subscriber implements Observer {

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name+ " got "+"The new video is here... " +channel.getTitle());
    }

    @Override
    public void subscribeToChannel(Channel channel) {
        this.channel = channel;
    }
}
