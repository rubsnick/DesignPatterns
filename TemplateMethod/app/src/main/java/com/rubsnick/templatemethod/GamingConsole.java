package com.rubsnick.templatemethod;

import android.util.Log;

/**
 * Created by rubenroman on 10/13/14.
 */
public class GamingConsole extends GamingDevice
{
    @Override
     void LoadGame()
    {
        Log.d("GamingConsole","Loading Disc or Digital Game");
    }

    @Override
     void IdentifyControllers()
    {
        Log.d("GamingConsole","Identifying Console Controllers");
    }
}
