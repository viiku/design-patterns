package WeatherMonitoringApp;

public class HumidityData implements Display, Observer {
    public void displayData() {
        System.out.println("This is showing Humidity Data");
    }

    public void update() {
        System.out.println("Updating HUmidity Data");
    }
}
