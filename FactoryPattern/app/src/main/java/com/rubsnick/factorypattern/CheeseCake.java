package com.rubsnick.factorypattern;

/**
 * Created by rubenroman on 10/1/14.
 */
public class CheeseCake extends Cake
{
    private String filling;
    private String frosting;

   public CheeseCake()
    {
        filling="Cream Cheese";
        frosting="Whip Cream";
    }

    @Override
    public String getFilling()
    {
        return filling;
    }

    @Override
    public String getFrosting()
    {
        return frosting;
    }
}
