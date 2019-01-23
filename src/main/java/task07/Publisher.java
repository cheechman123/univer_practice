package task07;

import java.util.ArrayList;

public class Publisher implements PublisherInterface{

    private String str = "text";
    private ArrayList<PublisherActionListener> listeners = new ArrayList<>();

    @Override
    public void addListener(PublisherActionListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(PublisherActionListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void removeAllListener() {
        listeners.clear();
    }

    @Override
    public void notifySubscribers(String message) {
        for(PublisherActionListener actionListener: listeners){
            actionListener.doAction(message);
        }
    }

    public void createNewMessage(String message){
        System.out.println("Publisher printed message:\n" + message);
        notifySubscribers(message);
    }
}
