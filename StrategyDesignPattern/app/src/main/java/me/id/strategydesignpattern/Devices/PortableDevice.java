package me.id.strategydesignpattern.Devices;

import android.util.Log;

import me.id.strategydesignpattern.Battery.Battery;
import me.id.strategydesignpattern.Screen.Screen;

/**
 * Created by rubenroman on 9/24/14.
 */
public class PortableDevice
{
    private String name;
    private String os;
    private String serialNumber;
    private Battery battery;
    private Screen screen;

    public PortableDevice()
    {

    }

    public void TurnOn()
    {
        Log.d("Portable Device","Turnon()");
         screen.TurnOn();
         battery.Discharge();
    }
    public void TurnOff()
    {
        Log.d("Portable Device","TurnOff()");
        screen.TurnOff();
        battery.Rest();

    }
    public void Charge()
    {
        Log.d("Portable Device","Charge()");
        battery.Charge();
        screen.TurnOn();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getOS()
    {
        return os;
    }

    public void setOS(String OS)
    {
        this.os = OS;
    }

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public Battery getBattery()
    {
        return battery;
    }

    public void setBattery(Battery battery)
    {
        this.battery = battery;
    }

    public Screen getScreen()
    {
        return screen;
    }

    public void setScreen(Screen screen)
    {
        this.screen = screen;
    }




}
