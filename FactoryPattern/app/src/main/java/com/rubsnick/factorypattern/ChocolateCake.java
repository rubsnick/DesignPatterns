package com.rubsnick.factorypattern;

/**
 * Created by rubenroman on 10/1/14.
 */
public class ChocolateCake extends Cake
{
    private String filling;
    private String frosting;

   public ChocolateCake()
    {
        filling="Chocolate Mix";
        frosting="fudge";
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
