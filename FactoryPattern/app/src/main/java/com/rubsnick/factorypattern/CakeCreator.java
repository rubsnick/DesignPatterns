package com.rubsnick.factorypattern;

import android.util.Log;

/**
 * Created by rubenroman on 10/1/14.
 */
public class CakeCreator
{
    public void createCake(String caketype)
    {
        Cake createdCake;
        CheeseCakeFactory myCheesecakeFactory= new CheeseCakeFactory();
        CakeFactory myCakeFactory=new CakeFactory();
        createdCake= myCakeFactory.CreateCake(caketype);

       if(createdCake==null)
       {
            createdCake=myCheesecakeFactory.CreateCake(caketype);
       }
        if(createdCake!=null)
        {
            Log.d(caketype, " Filling : " + createdCake.getFilling() + " Frosting :" + createdCake.getFrosting());
        }

    }
}
