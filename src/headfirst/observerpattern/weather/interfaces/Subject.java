package headfirst.observerpattern.weather.interfaces;

import headfirst.observerpattern.weather.interfaces.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
