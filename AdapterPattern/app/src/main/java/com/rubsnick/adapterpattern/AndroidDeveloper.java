package com.rubsnick.adapterpattern;

import android.util.Log;

/**
 * Created by rubenroman on 10/8/14.
 */
public class AndroidDeveloper implements Developer
{
    @Override public void Code()
    {
        Log.d("Android Developer : ","Coding");
    }

    @Override public void Architect()
    {
        Log.d("Android Developer : ","Architecting");
    }
}
