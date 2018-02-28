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
    //public boolean shooting;
    //private long lastTimeShoot;

    //public Asteroid(){
    //shooting = ( Math.random() < 0.5 )? true: false;
    //lastTimeShoot = 0;    
    //}

    public void act() 
    {
        Move();
        Gone();
    }

    public void Move() 
    {
        setLocation(getX(), getY() + speed ); 
        // was trying to adjust speed. work in progress variable does not seem to change.
    }

    public void Gone() 
    {
        if(getY() >= getWorld().getHeight() -1)
        {
            getWorld().removeObject(this);
        }
    }

     
}