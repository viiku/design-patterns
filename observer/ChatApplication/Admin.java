package ChatApplication;

import java.util.ArrayList;
import java.util.List;

public class Admin implements Subject{
    private List<Observer>observers = new ArrayList<>();
    private String messageString;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObserver() {
        for(Observer observer:observers) {
            observer.update(messageString);
        }
    }

    public void setNews(String messageString) {
        this.messageString = messageString;
        notifyObserver();
    }
}
