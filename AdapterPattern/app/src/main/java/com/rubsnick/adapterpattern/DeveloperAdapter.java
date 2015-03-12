package com.rubsnick.adapterpattern;

/**
 * Created by rubenroman on 10/8/14.
 */
public class DeveloperAdapter implements Engineer
{
    private Developer developer;
    public DeveloperAdapter(Developer developer)
    {
       this.developer=developer;
    }

    @Override
    public void SolveMath()
    {
        developer.Code();
    }

    @Override
    public void Design()
    {
        developer.Architect();
    }
}
