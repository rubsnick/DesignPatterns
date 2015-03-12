package com.rubsnick.commandpattern.Sniper;

import com.rubsnick.commandpattern.Command;

/**
 * Created by rubenroman on 10/6/14.
 */
public class SniperCeaseFireCommand implements Command
{
    Sniper sniper;
    public SniperCeaseFireCommand(Sniper sniper)
    {
        this.sniper =sniper;
    }

    @Override public void Execute()
    {

        sniper.CeaseFire();
    }

    @Override public void Undo()
    {
        //Undo Something
    }
}
