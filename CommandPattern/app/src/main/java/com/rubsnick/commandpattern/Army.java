package com.rubsnick.commandpattern;

import java.util.ArrayList;

/**
 * Created by rubenroman on 10/6/14.
 */
public class Army
{
    ArrayList<Command> attackCommands;
    ArrayList<Command> ceaseFireCommands;

    public Army()
    {
        attackCommands = new ArrayList<Command>();
        ceaseFireCommands = new ArrayList<Command>();
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++)
        {
            attackCommands.add(noCommand);
            ceaseFireCommands.add(noCommand);
        }
    }

    public void SetCommand(int position, Command fireCommand, Command ceaseFireCommand)
    {
        attackCommands.set(position, fireCommand);
        ceaseFireCommands.set(position, ceaseFireCommand);
    }

    public void AttackOrder(int position)
    {
        attackCommands.get(position).Execute();
    }

    public void CeaseFireOrder(int position)
    {
        ceaseFireCommands.get(position).Execute();
    }

    @Override
    public String toString()
    {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("/n------------Army-----------/n");
        for (int i = 0; i < attackCommands.size(); i++)
        {
            stringBuffer.append(
                    "Position :" + i + "/n Fire Command: Name" + attackCommands.getClass().getName() + "/n Cease Fire Command : Name " + ceaseFireCommands.get(
                            i).getClass().getName());

        }

        return stringBuffer.toString();
    }
}
