package com.rubsnick.observerpattern;

import android.util.Log;

/**
 * Created by rubenroman on 9/29/14.
 */
public class OutPostTwo implements Observer, DisplayElement
{
    String orders;

    Subject baseMessenger;

    public OutPostTwo(Subject baseMessenger)
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
        Log.d("OutPost Two : ",orders);
    }
}
