package me.id.strategydesignpattern.Battery;

import android.util.Log;

/**
 * Created by rubenroman on 9/24/14.
 */
public class AlkalineBattery implements Battery
{
    @Override
    public void Charge()
    {
        Log.d("Charge","Alkaline Charging Stuff");
    }
    @Override
    public void Discharge()
    {
        Log.d("Discharge","Alkaline Discharge Stuff");
    }
    @Override
    public void Rest()
    {
        Log.d("Rest","Alkaline Rest Stuff");
    }

}
