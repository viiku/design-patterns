package WeatherMonitor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConcreteWeatherObserver concreteWeatherObserver = new ConcreteWeatherObserver();

        WeatherObserver weatherObserver = new WeatherObserver("hobbit");


    }
}
