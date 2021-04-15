package observer;

import observer.display.CurrentConditionsDisplay;
import observer.subject.WeatherData;

public class SimulateWeatherForecast {

    public static void main(String[] args) {

        //lets add only one display for testing, we can implement others later
        WeatherData dataGenerator = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(dataGenerator);

        //update measurements
        dataGenerator.measurementsChanged();

        //display on screen
        currentConditionsDisplay.display();


    }
}
