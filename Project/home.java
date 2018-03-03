import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class home extends World
{ 
    GreenfootSound startSound;
    /**
     * Constructor for objects of class home.
     * 
     */
    public home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        button start = new button();
        addObject(start,450 ,300);
       startSound = new GreenfootSound("home.mp3");
       //Greenfoot.start();
    }
    
       }



