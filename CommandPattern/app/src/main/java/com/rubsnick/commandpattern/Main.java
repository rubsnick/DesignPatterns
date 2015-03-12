package com.rubsnick.commandpattern;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.rubsnick.commandpattern.Calvary.Calvary;
import com.rubsnick.commandpattern.Calvary.CalvaryAttackCommand;
import com.rubsnick.commandpattern.Calvary.CalvaryCeaseFireCommand;
import com.rubsnick.commandpattern.Infantry.Infantry;
import com.rubsnick.commandpattern.Infantry.InfantryAttackCommand;
import com.rubsnick.commandpattern.Infantry.InfantryCeaseFireCommand;
import com.rubsnick.commandpattern.Sniper.Sniper;
import com.rubsnick.commandpattern.Sniper.SniperAttackCommand;
import com.rubsnick.commandpattern.Sniper.SniperCeaseFireCommand;


public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Army army=new Army();

        Calvary calvary=new Calvary();
        Infantry infantry=new Infantry();
        Sniper sniper=new Sniper();

        SniperAttackCommand sniperAttackCommand=new SniperAttackCommand(sniper);
        SniperCeaseFireCommand sniperCeaseFireCommand=new SniperCeaseFireCommand(sniper);

        CalvaryAttackCommand calvaryAttackCommand=new CalvaryAttackCommand(calvary);
        CalvaryCeaseFireCommand calvaryCeaseFireCommand=new CalvaryCeaseFireCommand(calvary);

        InfantryAttackCommand infantryAttackCommand=new InfantryAttackCommand(infantry);
        InfantryCeaseFireCommand infantryCeaseFireCommand=new InfantryCeaseFireCommand(infantry);

        army.SetCommand(0,infantryAttackCommand,infantryCeaseFireCommand);
        army.SetCommand(1,sniperAttackCommand,sniperCeaseFireCommand);
        army.SetCommand(2,calvaryAttackCommand,calvaryCeaseFireCommand);

        army.AttackOrder(0);
        army.AttackOrder(1);
        army.AttackOrder(2);

        army.CeaseFireOrder(0);
        army.CeaseFireOrder(1);
        army.CeaseFireOrder(2);
        Log.d("Army Details",army.toString());
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
