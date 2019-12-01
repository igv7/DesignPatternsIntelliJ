package behavioural.observer;

public interface Subject {
    String getTitle();

    void setTitle(String title);

    void subscribe(Subscriber subscriber);

    void unSubscribe(Subscriber subscriber);

    void notifyAllUsers();

    void uploadNewContent(String title);
}
