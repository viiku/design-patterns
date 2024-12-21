package WeatherMonitoringApp;

public class PressureData implements Display, Observer{
    public void displayData() {
        System.out.println("This is showing Pressure data");
    }
    public void update() {
        System.out.println("Updating Pressure data..");
    }
}
