package WeatherMonitor;

public interface WeatherSubject {
    void registerObserver();
    void removeObserver();
    void notifyObserver();
}
