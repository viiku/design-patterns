package WeatherMonitoringStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observers;
    private double temp, humidity, pressure;
    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObserver() {
        for(Observer observer: observers) {
            observer.update(temp, humidity, pressure);
        }
    }

    public void setMeasurements(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }



    public double getTemperature(){
        return temp;
    }
    public double getHumidity() {
        return humidity;
    }
    public double getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    @Override
    public void notifyObserver(Observer o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyObserver'");
    }

    // WeatherData weatherData = new WeatherData(12.10,14.02,15.33);
    // weatherData.setTemperature(22.31);
    // weatherData.set(22.31);
}
