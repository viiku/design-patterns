package WeatherMonitoringApp;

public class ThirdParty implements Display, Observer {
    public void displayData() {
        System.out.println("This is showing Third Party Data");
    }

    public void update() {
        System.out.println("Updating Third Party Data");
    }
}
