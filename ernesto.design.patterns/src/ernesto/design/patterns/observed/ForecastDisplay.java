package ernesto.design.patterns.observed;

public class ForecastDisplay implements DisplayElement, Observer {
	
	private float currenPressure;
	private float lastPressure;
	private boolean flag = true;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		if(flag) {
			currenPressure = pressure;
			flag = !flag;
		}
		
		lastPressure = currenPressure;
		currenPressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("Forecast: " +
								(
									(currenPressure > lastPressure)? "Improving wather.\n" : 
									(currenPressure < lastPressure)? "Getting Cooler, rainy wather.\n" : 
																	 "More of the same.\n"
								));
	}

}
