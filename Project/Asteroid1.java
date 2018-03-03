import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid1 extends Actor
{
    public int speed = 3;
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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