package com.rubsnick.decoratorpattern;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class Main extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Weapon mySword = new Sword();
        WeaponDecorator gem = new DestructionGem("Final Destruction Test", mySword);
        WeaponDecorator enchantment = new HolyEnchantment("Enchanted Sword", gem);
        Log.d("Supped Up Sword",
                "Attack : " + enchantment.Attack() + " Defense : " + enchantment.Defense() + " Description : " + enchantment.getDescription());
   Weapon axe=new Axe();
        WeaponDecorator enchantedAxe=new HolyEnchantment("Enchanted Axe",axe);

        Log.d("Enchanted Axe",
                "Attack : " + enchantedAxe.Attack() + " Defense : " + enchantedAxe.Defense() + " Description : " + enchantedAxe.getDescription());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
