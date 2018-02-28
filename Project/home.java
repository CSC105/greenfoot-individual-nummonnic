import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class home extends World
{
    GreenfootSound sound = new GreenfootSound("start.wav");
    /**
     * Constructor for objects of class home.
     * 
     */
    public home()
    {    
        super(900, 600, 1);
        addObject(new button(),450 ,300);
        //sound.playLoop();
    }
}
