package com.rubsnick.observerpattern;

import android.net.NetworkInfo;

import java.util.ArrayList;

/**
 * Created by rubenroman on 9/29/14.
 */
public class BaseMessenger implements Subject
{
    String value;
    private ArrayList<Observer>lstObservers=new ArrayList<Observer>();
  public  BaseMessenger()
    {

    }
    @Override
    public void RegisterObserver(Observer o)
    {
            lstObservers.add(o);
    }

    @Override
    public void RemoveObserver(Observer o)
    {
            lstObservers.remove(0);
    }

    @Override
    public void NotifyObservers()
    {
        for(int i=0;i<lstObservers.size();i++)
        {
            lstObservers.get(i).update(value);
        }
    }

    public void StateChanged()
    {
        NotifyObservers();
    }

    public void RetrieveData(String data)
    {
        value=data;
        StateChanged();
    }


}
