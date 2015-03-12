package com.rubsnick.factorypattern;

/**
 * Created by rubenroman on 10/1/14.
 */
public class StrawberryCheeseCake extends Cake
{
    private String filling;
    private String frosting;

   public StrawberryCheeseCake()
    {
        filling="Cream Cheese";
        frosting="Strawberries";
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
