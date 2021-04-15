package observer.display;

import observer.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temp;

    private float humidity;

    private float pressure;

    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temp: " + temp + " humidity: " + humidity + " pressure: " + pressure);
    }

    public void unsubscribe() {
        weatherData.removeObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
