package com.rubsnick.decoratorpattern;

/**
 * Created by rubenroman on 9/30/14.
 */
public class DestructionGem extends WeaponDecorator
{
    private int attack;
    private int defense;
    private String description;
    private Weapon weapon;

    public DestructionGem(String description, Weapon weapon)
    {
        this.attack = 100;
        this.defense = -30;
        this.description = description;
        this.weapon = weapon;
    }

    @Override
    public int Attack()
    {
        return attack + weapon.Attack();
    }

    @Override
    public int Defense()
    {
        return defense + weapon.Defense();
    }

    @Override
    public String getDescription()
    {
        return description;
    }
}
