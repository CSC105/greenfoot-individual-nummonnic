import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid1 extends Actor
{
    public int speed = 2;
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() // main for the trees it will keep doing these over and over
    {
        Move();
        Gone();
    }  
    
    public void Move() //this moves the trees down the screen. I added a speed still working out bugs to make the trees move faster or slower depending on up or down.
    {
        setLocation(getX(), getY() + speed ); 
        // was trying to adjust speed. work in progress variable does not seem to change.
    }
    
     public void Gone() // removes trees when they reach the bottom of the world.
     {
         if(getY() >= getWorld().getHeight() -1)
         {
             getWorld().removeObject(this);
         }
     }
}