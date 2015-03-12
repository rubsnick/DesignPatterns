package me.id.strategydesignpattern.Screen;

import android.util.Log;

/**
 * Created by rubenroman on 9/24/14.
 */
public class LCDScreen implements Screen
{
    @Override
    public void TurnOn()
    {
        Log.d("LCDScreen","Turn On LCD Screen");
    }
    @Override
    public void TurnOff()
    {
        Log.d("LCDScreen","Turn off LCD Screen");
    }
}
