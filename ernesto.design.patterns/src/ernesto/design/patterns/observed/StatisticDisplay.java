package ernesto.design.patterns.observed;

public class StatisticDisplay implements Observer, DisplayElement {

	private float maxTemp = 0.0f;
	private float minTemp = 0.0f;
	private float sumTemp = 0.0f;
	private int numReads  = 0;
	private WeatherData weatherData;
	
	public StatisticDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Temperature statistic\n" +
							"Average: " + (sumTemp / numReads) + 
							" F\nMin: " + minTemp + 
							" F\nMax: " + maxTemp + " F\n");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
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
