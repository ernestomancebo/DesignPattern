package ernesto.design.patterns.observedJava;

public class WatherStation {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		
		CurrentContidionsDisplay ccd = new CurrentContidionsDisplay(wd);
		HeatIndex hi = new HeatIndex(wd);
		StatisticDisplay sd = new StatisticDisplay(wd);
		ForecastDisplay  fd = new ForecastDisplay(wd);
				
		wd.setMeasurements(80, 65, 30.4f);
		System.out.println("-------");
		wd.setMeasurements(82, 70, 29.4f);
		System.out.println("-------");
		wd.setMeasurements(78, 90, 29.4f);
	}

}