package com.rubsnick.decoratorpattern;

/**
 * Created by rubenroman on 9/30/14.
 */
public class Axe extends Weapon
{
    private int attack;
    private int defense;

    public Axe()
    {
        this.attack=150;
        this.defense=50;
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
