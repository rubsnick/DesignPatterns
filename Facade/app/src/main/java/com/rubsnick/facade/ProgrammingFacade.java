package com.rubsnick.facade;

import android.util.Log;

/**
 * Created by rubenroman on 10/8/14.
 */
public class ProgrammingFacade
{
    private Coder coder;
    private Computer computer;
    private MusicPlayer musicPlayer;

    public ProgrammingFacade(Coder coder, Computer computer, MusicPlayer musicPlayer)
    {
        this.coder = coder;
        this.computer = computer;
        this.musicPlayer = musicPlayer;

    }

    public void PreparingToCode()
    {
        Log.d("Programing Facade","Preparing To Code");
        computer.TurnOn();
        coder.Caffinate();
        musicPlayer.PlayMusic();
    }

    public void StopCoding()
    {
        Log.d("Programing Facade","Stopping Code");
        musicPlayer.StopMusic();
        computer.ShutOff();
        coder.Caffinate();
    }
}
