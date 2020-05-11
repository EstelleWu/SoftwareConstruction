import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	protected List<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer o) {
		if (!observers.contains(o)) {
			observers.add(o);
		}
	}
	
	public void notify(String animal_name) {
		for (Observer o: observers) {
			o.update(animal_name);
		}
	}
}
