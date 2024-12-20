package WeatherMonitoringStation;

public class WeatherStation {
    
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4);
        weatherData.setMeasurements(82, 70, 35.2);
        weatherData.setMeasurements(65, 90, 20.4);
        weatherData.setMeasurements(10, 45, 56);
    }
}
