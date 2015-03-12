package com.rubsnick.commandpattern.Sniper;

import com.rubsnick.commandpattern.Command;
import com.rubsnick.commandpattern.Infantry.Infantry;

/**
 * Created by rubenroman on 10/6/14.
 */
public class SniperAttackCommand implements Command
{
    Sniper sniper;
    public SniperAttackCommand(Sniper sniper)
    {
        this.sniper =sniper;
    }

    @Override public void Execute()
    {
        sniper.CalculateWind();
        sniper.Aim();
        sniper.Fire();
    }

    @Override public void Undo()
    {
        //Undo Something
    }
}
