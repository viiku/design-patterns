package WeatherMonitoringStation;

// All potential observers need to implement the Observer
// interface. This interface has just one method, update(),
// that is called when the Subject’s state changes.
public interface Observer {
    void update(double temp, double humidity, double pressure);
}
