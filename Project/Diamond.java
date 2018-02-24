import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond extends Actor
{
    public int speed = 2;
    /**
     * Act - do whatever the Diamond wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Move();
        Gone();
        //if( shooting ) shoot();
    }
    
    public void Move() 
    {
        setLocation(getX()+speed, getY()); 
        // was trying to adjust speed. work in progress variable does not seem to change.
    }
    
    public void Gone() 
    {
         if(getX() >= getWorld().getWidth() -1)
         {
             getWorld().removeObject(this);
         }
    }
    }