package com.rubsnick.commandpattern;

/**
 * Created by rubenroman on 10/6/14.
 */
public interface Command
{
    public void Execute();
    public void Undo();
}
