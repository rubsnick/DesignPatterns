package com.rubsnick.decoratorpattern;

/**
 * Created by rubenroman on 9/30/14.
 */
public class Sword extends Weapon
{
    private int attack;
    private int defense;

    public Sword()
    {
        this.attack=100;
        this.defense=25;
    }

    @Override
    public int Attack()
    {
        return attack;
    }

    @Override
    public int Defense()
    {
        return defense;
    }
}
