package com.rubsnick.decoratorpattern;

/**
 * Created by rubenroman on 9/30/14.
 */
public class HolyEnchantment extends WeaponDecorator
{
    private int attack;
    private int defense;
    private String description;
    private Weapon weapon;

    public HolyEnchantment(String description,Weapon weapon)
    {
        this.attack=10;
        this.defense=50;
        this.description=description;
        this.weapon=weapon;
    }

    @Override
    public int Attack()
    {
        return attack+weapon.Attack();
    }

    @Override
    public int Defense()
    {
        return attack+weapon.Defense();
    }

    @Override
    public String getDescription()
    {
        return description;
    }
}
