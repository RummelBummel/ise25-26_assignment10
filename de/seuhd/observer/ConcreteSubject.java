package de.seuhd.observer;

public class ConcreteSubject extends Subject {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        System.out.println("Value of subject updated to " + value);
        notifyObservers();
    }
}
