package de.seuhd.observer;

public class ConcreteObserver implements Observer {
    // TODO: Add fields and static variables.
    private static int nextId = 1;

    private final int id;
    private final Subject subject;

    public ConcreteObserver(Subject subject) {
        // TODO: Implement constructor.
        this.subject = subject;
        this.id = nextId++;
        this.subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        // TODO: Implement update method.
        if (subject instanceof ConcreteSubject concreteSubject) {
            System.out.println(
                    "Observer " + id + " received update from subject : New value is " + concreteSubject.getValue()
            );
        }
    }

    public void detach() {
        // TODO: Implement detach method.
        subject.detach(this);
    }
}
