package me.id.strategydesignpattern;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import me.id.strategydesignpattern.Battery.AlkalineBattery;
import me.id.strategydesignpattern.Battery.LithiumIonBattery;
import me.id.strategydesignpattern.Devices.OnePlus;
import me.id.strategydesignpattern.Devices.PortableDevice;
import me.id.strategydesignpattern.Devices.SamsungPhone;
import me.id.strategydesignpattern.Screen.LCDScreen;
import me.id.strategydesignpattern.Screen.OLEDScreen;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("WHAT IS GOING ON","I DONT FREAKING KNOW");
        SamsungPhone GalaxyS4=new SamsungPhone();


       // GalaxyS4.setScreen(new OLEDScreen());
       // GalaxyS4.setBattery(new LithiumIonBattery());

        GalaxyS4.TurnOn();
       GalaxyS4.TurnOff();
       GalaxyS4.Charge();

        Log.d("TouchWiz Version",GalaxyS4.getTouchwizversion());

        OnePlus One=new OnePlus();
        One.setScreen(new LCDScreen());
        One.setBattery(new AlkalineBattery());
        One.TurnOn();
        One.TurnOff();
        One.Charge();

        Log.d("CyanogenMod Version",One.getCyanogenmodversion());



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
