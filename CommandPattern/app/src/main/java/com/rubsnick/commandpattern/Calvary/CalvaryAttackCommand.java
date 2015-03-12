package com.rubsnick.commandpattern.Calvary;

import com.rubsnick.commandpattern.Command;

/**
 * Created by rubenroman on 10/6/14.
 */
public class CalvaryAttackCommand implements Command
{
    Calvary calvary;
    public CalvaryAttackCommand(Calvary calvary)
    {
        this.calvary=calvary;
    }

    @Override public void Execute()
    {
        calvary.Riding();
        calvary.Fire();
    }

    @Override public void Undo()
    {
        //Undo Something
    }
}
