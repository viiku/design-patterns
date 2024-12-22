package WeatherMonitor;

public class Hobbits implements WeatherObserver {
    void update(WeatherType currentWeather) {
        System.out.println("The hobbits facing the weather now.");
    }
}
