package WeatherMonitoringStation;

// the Subject interface. Objects use this interface to register as
// observers and also to remove themselves from being observers.

// Each subject can have many observers
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver(Observer o);
}
