package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private String title;
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyAllUsers() {
        for (Subscriber subscriber: subscribers) {
            subscriber.update();
        }
    }

    @Override
    public void uploadNewContent(String title) {
        this.title = title;
        notifyAllUsers();
    }
}