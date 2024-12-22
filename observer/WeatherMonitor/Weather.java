package WeatherMonitor;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public Weather() {
        observers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }

    void registerObserver(WeatherObserver weatherObserver) {
        observers.add(weatherObserver);
    }

    void removeObserver(WeatherObserver weatherObserver) {
        observers.remove(weatherObserver);
    }

    void notifyObserver() {
        
    }
}
