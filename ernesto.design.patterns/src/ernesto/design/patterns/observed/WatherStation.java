package ernesto.design.patterns.observed;

public class WatherStation {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		
		CurrentContidionsDisplay ccd = new CurrentContidionsDisplay(wd);
		StatisticDisplay sd = new StatisticDisplay(wd);
		ForecastDisplay  fd = new ForecastDisplay(wd);
		HeatIndex hi = new HeatIndex(wd);
		
		wd.setMeasurements(80, 65, 30.4f);
		wd.setMeasurements(82, 70, 29.4f);
		wd.setMeasurements(78, 90, 29.4f);
	}

}