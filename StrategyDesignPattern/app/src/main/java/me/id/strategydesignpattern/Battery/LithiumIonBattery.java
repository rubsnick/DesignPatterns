package me.id.strategydesignpattern.Battery;

import android.util.Log;

/**
 * Created by rubenroman on 9/24/14.
 */
public class LithiumIonBattery implements Battery
{
    @Override
    public void Charge()
    {
        Log.d("Charge","Lithium Ion Charging Stuff");
    }
    @Override
    public void Discharge()
    {
        Log.d("Discharge","Lithium Ion Discharge Stuff");
    }
    @Override
    public void Rest()
    {
        Log.d("Rest","Lithium Ion Rest Stuff");
    }

}
