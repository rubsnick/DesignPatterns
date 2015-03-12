package me.id.strategydesignpattern.Devices;

/**
 * Created by rubenroman on 9/24/14.
 */
public class OnePlus extends PortableDevice
{


    private String cyanogenmodversion;


    public OnePlus()
     {
        cyanogenmodversion ="Cyano Gen 11";
     }

    public String getCyanogenmodversion()
    {
        return cyanogenmodversion;
    }

    public void setCyanogenmodversion(String cyanogenmodversion)
    {
        this.cyanogenmodversion = cyanogenmodversion;
    }



}
