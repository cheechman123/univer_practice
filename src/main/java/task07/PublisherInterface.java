package task07;

public interface PublisherInterface {
    void addListener(PublisherActionListener listener);
    void removeListener(PublisherActionListener listener);
    void removeAllListener();
    void notifySubscribers(String message);

}
