package ernesto.design.patterns.observedJava;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            lastPressure    = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

	@Override
	public void display() {
		System.out.println("Forecast: " +
								(
									(currentPressure > lastPressure)? "Improving wather.\n" : 
									(currentPressure < lastPressure)? "Getting Cooler, rainy wather.\n" : 
																	  "More of the same.\n"
								));
	}

}
