package com.rubsnick.observerpattern;

/**
 * Created by rubenroman on 9/29/14.
 */
public interface Subject
{
    public void RegisterObserver(Observer o);
    public void RemoveObserver(Observer o);
    public void NotifyObservers();
}
