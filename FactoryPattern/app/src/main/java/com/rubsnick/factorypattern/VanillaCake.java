package com.rubsnick.factorypattern;

/**
 * Created by rubenroman on 10/1/14.
 */
public class VanillaCake extends Cake
{
    private String filling;
    private String frosting;

   public VanillaCake()
    {
        filling="Yellow";
        frosting="Icing";
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
