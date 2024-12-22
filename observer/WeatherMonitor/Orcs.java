package WeatherMonitor;

public class Orcs implements WeatherObserver {
    public void update(WeatherType currentWeather) {
        System.out.println("The orcs facing the weather now.");
    }
}
