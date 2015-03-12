package me.id.strategydesignpattern.Screen;

import android.util.Log;

/**
 * Created by rubenroman on 9/24/14.
 */
public class OLEDScreen implements Screen
{
    @Override
    public void TurnOn()
    {
        Log.d("OLEDScreen","Turn On OLED Screen");
    }
    @Override
    public void TurnOff()
    {
        Log.d("OLEDScreen","Turn off OLED Screen");
    }
}
