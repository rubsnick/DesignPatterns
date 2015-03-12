package com.rubsnick.commandpattern.Infantry;

import com.rubsnick.commandpattern.Command;

/**
 * Created by rubenroman on 10/6/14.
 */
public class InfantryCeaseFireCommand implements Command
{
    Infantry infantry;
    public InfantryCeaseFireCommand(Infantry infantry)
    {
        this.infantry=infantry;
    }

    @Override public void Execute()
    {
        infantry.CeaseFire();
    }

    @Override public void Undo()
    {
        //Undo Something
    }
}
