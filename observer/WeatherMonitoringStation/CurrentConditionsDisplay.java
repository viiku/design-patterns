package WeatherMonitoringStation;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private double temp;
    private double humidity;
    private double pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temp+ "F degrees and " + humidity + "% humidity");
    }
}
