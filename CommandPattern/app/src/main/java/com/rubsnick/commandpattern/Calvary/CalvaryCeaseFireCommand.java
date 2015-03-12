package com.rubsnick.commandpattern.Calvary;

import com.rubsnick.commandpattern.Command;

/**
 * Created by rubenroman on 10/6/14.
 */
public class CalvaryCeaseFireCommand implements Command
{
    Calvary calvary;
    public CalvaryCeaseFireCommand(Calvary calvary)
    {
        this.calvary=calvary;
    }

    @Override public void Execute()
    {
        calvary.CeaseFire();
    }

    @Override public void Undo()
    {
        //Undo Something
    }
}
