package com.epam.model.observer;

public interface Observable {
    void attach(CustomObserver observer);

    void detach(CustomObserver observer);

    void notifyObservers();
}