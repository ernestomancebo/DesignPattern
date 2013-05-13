package ernesto.design.patterns.observed;

public interface Subject {
	public void registerObserver(Object o);
	public void removeObserver(Object o);
	public void notifyObservers();
}
