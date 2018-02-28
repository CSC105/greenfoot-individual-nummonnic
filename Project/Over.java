import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Over extends World
{
    public static int score = 0;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public Over()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        addObject(new button1(),450 ,500);
    }
    public static int score(){
        return score = 0;
}
}
