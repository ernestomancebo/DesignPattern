package ernesto.design.patterns.observedJava;

import java.util.Observer;
import java.util.Observable;

public class CurrentContidionsDisplay implements Observer, DisplayElement {

	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentContidionsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData) {
			WeatherData wd   = (WeatherData) obs;
			this.temperature = wd.getTemperature();
			this.humidity    = wd.getHumidity();
			display();
		}
	}
	
	@Override
	public void display(){
		System.out.println("Current conditions\n" +
							"Temperature: " + temperature + 
							" F\nHumidity: " + humidity + "%\n");
	}
}
