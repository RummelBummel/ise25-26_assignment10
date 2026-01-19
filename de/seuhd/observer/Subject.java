package de.seuhd.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    // TODO: Add fields.
    private final List<Observer> observers = new ArrayList<>();

    void attach(Observer observer) {
        // TODO: Implement attach method.
        if (observer == null) return;
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    void detach(Observer observer) {
        // TODO: Implement detach method.
        observers.remove(observer);
    }

    protected void notifyObservers() {
        // TODO: Implement fireUpdate method.
        System.out.println("Sending update to observers ...");
        // defensive copy: erlaubt detach() während update ohne ConcurrentModification
        List<Observer> snapshot = new ArrayList<>(observers);
        for (Observer o : snapshot) {
            o.update(this);
        }
    }
}
