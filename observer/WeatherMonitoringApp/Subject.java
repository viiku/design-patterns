package WeatherMonitoringApp;

public interface Subject {
    void registerObserver();
    void removeObserver();
    void notifyObserver();
}
