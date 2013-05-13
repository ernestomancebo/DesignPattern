package ernesto.design.patterns.observedJava;

import java.util.Observer;
import java.util.Observable;

public class StatisticDisplay implements Observer, DisplayElement {

	private float maxTemp = 0.0f;
	private float minTemp = 0.0f;
	private float sumTemp = 0.0f;
	private int numReads  = 0;
	
	public StatisticDisplay(Observable observable) {
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Temperature statistic\n" +
							"Average: " + (sumTemp / numReads) + 
							" F\nMin: " + minTemp + 
							" F\nMax: " + maxTemp + " F\n");
	}

	@Override
	public void update(Observable observable, Object arg) {
		if(observable instanceof WeatherData){
			WeatherData weatherData = (WeatherData) observable;
			float temperature = weatherData.getTemperature();
			
			numReads ++;
			sumTemp = sumTemp + temperature;
			
			if(temperature > maxTemp) {
				this.maxTemp = temperature;
			}
			
			if(numReads == 1) {
				this.minTemp = temperature;
			}
			
			if(temperature < minTemp) {
				this.minTemp = temperature;
			}
			
			display();
		}
	}

}
