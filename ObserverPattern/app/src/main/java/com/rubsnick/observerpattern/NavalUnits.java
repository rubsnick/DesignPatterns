package com.rubsnick.observerpattern;

import android.util.Log;

/**
 * Created by rubenroman on 9/29/14.
 */
public class NavalUnits implements Observer, DisplayElement
{
    String orders;

    Subject baseMessenger;

    public NavalUnits(Subject baseMessenger)
    {
       this.baseMessenger=baseMessenger;
        baseMessenger.RegisterObserver(this);
    }


    @Override
    public void update(String value)
    {
        orders=value;
        Display();
    }

    @Override
    public void Display()
    {
        Log.d("Naval Units : ",orders);
    }
}
