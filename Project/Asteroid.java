import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    public int speed = 1;
    
    
    
    public void act() 
    {
        Move(); 
        Gone();
        
    }
    
    public void Move() 
    {
        setLocation(getX(), getY() + speed ); 
        
    }
    
     public void Gone() 
     {
         if(getY() >= getWorld().getHeight() -1)
         {
             getWorld().removeObject(this);
         }
     }
    }