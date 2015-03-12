package com.rubsnick.templatemethod;

import android.util.Log;

/**
 * Created by rubenroman on 10/13/14.
 */
public class PortableGamingConsole extends GamingDevice
{
    @Override
     void LoadGame()
    {
        Log.d("PortableGamingConsole","Loading Cartridge or Digital Game");
    }

    @Override
     void IdentifyControllers()
    {
        Log.d("PortableGamingConsole","Portable Device only has 1 Controller");
    }
}
