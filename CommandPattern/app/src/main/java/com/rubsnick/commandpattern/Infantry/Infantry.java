package com.rubsnick.commandpattern.Infantry;

import android.util.Log;

/**
 * Created by rubenroman on 10/6/14.
 */
public class Infantry
{
    public void March()
    {
        Log.d("Infantry","Marching Into Position");
    }
    public void Fire()
    {
        Log.d("Infantry","Firing");
    }

    public void CeaseFire()
    {
        Log.d("Infantry","Stop Firing");
    }
}
