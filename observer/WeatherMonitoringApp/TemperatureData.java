package WeatherMonitoringApp;

public class TemperatureData implements Display, Observer{
    public void displayData() {
        System.out.println("This is showing Temperature Data");
    }

    public void update() {
        System.out.println("Updating Temprature Data");
    }
}
