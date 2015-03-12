package com.rubsnick.factorypattern;

/**
 * Created by rubenroman on 10/1/14.
 */
public class CheeseCakeFactory
{
    public Cake CreateCake(String CakeType)
    {
        Cake createdCake=null;
            if(CakeType.equals(CakeTypes.CHEESE_CAKE))
            {
              createdCake=new CheeseCake();
            }
        else if (CakeType.equals(CakeTypes.STRAWBERRY_CHEESE_CAKE))
            {
                createdCake=new StrawberryCheeseCake();
            }
        return createdCake;
    }
}
