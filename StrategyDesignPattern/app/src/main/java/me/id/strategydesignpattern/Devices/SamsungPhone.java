package me.id.strategydesignpattern.Devices;

import me.id.strategydesignpattern.Battery.Battery;
import me.id.strategydesignpattern.Battery.LithiumIonBattery;
import me.id.strategydesignpattern.Screen.OLEDScreen;
import me.id.strategydesignpattern.Screen.Screen;

/**
 * Created by rubenroman on 9/24/14.
 */
public class SamsungPhone extends PortableDevice
{


    private String touchwizversion;


    public SamsungPhone()
     {
         touchwizversion="This Version";
         setScreen(new OLEDScreen());
         setBattery(new LithiumIonBattery());
     }

    public String getTouchwizversion()
    {
        return touchwizversion;
    }

    public void setTouchwizversion(String touchwizversion)
    {
        this.touchwizversion = touchwizversion;
    }



}
