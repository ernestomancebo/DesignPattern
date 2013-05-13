package ernesto.design.patterns.observed;

public class CurrentContidionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentContidionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	@Override
	public void display(){
		System.out.println("Current conditions\n" +
							"Temperature: " + temperature + 
							" F\nHumidity: " + humidity + "%\n");
	}
}
