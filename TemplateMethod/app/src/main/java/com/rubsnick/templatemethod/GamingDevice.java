package com.rubsnick.templatemethod;

import android.util.Log;

/**
 * Created by rubenroman on 10/13/14.
 */
public abstract class GamingDevice
{
   public void PlayDevice()
   {
       TurnOn();
       IdentifyControllers();
       LoadGame();
       ShowGame();
       TurningOff();

   }

    private void TurnOn()
    {
        Log.d("GamingDevice","Turning On");
    }
    private void ShowGame()
    {
        Log.d("GamingDevice","Showing Game");
    }
    private void TurningOff()
    {
        Log.d("GamingDevice","Turning Off");
    }
     abstract void LoadGame();
     abstract void IdentifyControllers();


}
