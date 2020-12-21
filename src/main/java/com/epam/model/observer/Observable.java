package com.epam.model.observer;

import com.epam.model.observer.CustomObserver;

public interface Observable {
    void attach(CustomObserver observer);

    void detach(CustomObserver observer);

    void notifyObservers();
}