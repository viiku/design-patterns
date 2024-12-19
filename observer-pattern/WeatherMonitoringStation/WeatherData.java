package WeatherMonitoringStation;

public class WeatherData {
    public void getTemperature(){

    }
    public void getHumidity() {

    }
    public void getPressure() {

    }

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }
}
