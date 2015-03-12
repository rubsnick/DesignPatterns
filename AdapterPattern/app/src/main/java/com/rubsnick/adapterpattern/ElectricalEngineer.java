package com.rubsnick.adapterpattern;

import android.util.Log;

/**
 * Created by rubenroman on 10/8/14.
 */
public class ElectricalEngineer implements Engineer
{
    @Override public void SolveMath()
    {
        Log.d("Electrical Engineer : ", "Solving Math Problems");
    }

    @Override public void Design()
    {
        Log.d("Electrical Engineer : ", "Designing");
    }
}
