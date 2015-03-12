package com.rubsnick.factorypattern;

/**
 * Created by rubenroman on 10/1/14.
 */
public class CakeFactory
{
    public Cake CreateCake(String CakeType)
    {
        Cake createdCake=null;
            if(CakeType.equals(CakeTypes.VANILLA))
            {
              createdCake=new VanillaCake();
            }
        else if (CakeType.equals(CakeTypes.CHOCOLATE))
            {
                createdCake=new ChocolateCake();
            }
        return createdCake;
    }
}
