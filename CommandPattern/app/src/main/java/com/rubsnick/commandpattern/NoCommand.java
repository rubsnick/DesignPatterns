package com.rubsnick.commandpattern;

/**
 * Created by rubenroman on 10/6/14.
 */
public class NoCommand implements Command
{
    @Override public void Execute()
    {
        //Do Nothing
    }

    @Override public void Undo()
    {
        // Nothing to Undo
    }
}
