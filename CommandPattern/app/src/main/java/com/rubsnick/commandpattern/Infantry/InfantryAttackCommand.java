package com.rubsnick.commandpattern.Infantry;

import com.rubsnick.commandpattern.Command;

/**
 * Created by rubenroman on 10/6/14.
 */
public class InfantryAttackCommand implements Command
{
    Infantry infantry;
    public InfantryAttackCommand(Infantry infantry)
    {
        this.infantry=infantry;
    }

    @Override public void Execute()
    {
        infantry.March();
        infantry.Fire();
    }

    @Override public void Undo()
    {
        //Undo Something
    }
}
