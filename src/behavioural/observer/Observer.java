package behavioural.observer;

public interface Observer {
    void update();
    void subscribeToChannel(Channel channel);
}
