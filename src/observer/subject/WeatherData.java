package observer.subject;

import observer.display.Observer;

import java.util.List;
import java.util.ArrayList;

public class WeatherData implements Subject{

    private final List<Observer> observers;

    private float temp;

    private float humidity;

    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(temp, humidity, pressure));
    }

    private void updateChanges(){
        temp = (float)(0.01f + Math.random() * (1.5f - 0.01f));
        humidity = (float)(0.01f + Math.random() * (1.5f - 0.01f));
        pressure = (float)(0.01f + Math.random() * (1.5f - 0.01f));
    }

    public void measurementsChanged() {
        updateChanges();
        notifyObservers();
    }
}
