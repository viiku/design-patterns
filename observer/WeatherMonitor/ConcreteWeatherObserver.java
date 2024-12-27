package WeatherMonitor;

import java.util.List;

public class ConcreteWeatherObserver {
    List<WeatherObserver> observers;

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void notifyObserver(WeatherObserver observer) {
        for(WeatherObserver obs: observers) {
            obs.update();
        }
    }

    // public void setData()
}
