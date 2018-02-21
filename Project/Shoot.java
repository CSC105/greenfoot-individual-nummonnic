import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shoot extends Actor
{
    private fla myShip;
    /**
     * Act - do whatever the Shoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Shoot(fla myShip)
    {
        this.myShip = myShip;
    }
    public void act() 
    {
        int y = getY();
        if(y > 0)
        {
        y = y - 5;
        setLocation(getX(), y);
        Actor rock = getOneIntersectingObject(Asteroid.class);
        if (rock != null) {
                // We've hit an asteroid!
                hitAnAsteroid();
                getWorld().removeObject(rock);
                getWorld().removeObject(this);
            }
        }
        else {
            // I reached the top of the screen
            getWorld().removeObject(this);
        }
        // Add your action code here.
    }    
    private void hitAnAsteroid()
    {
        // What goes here????
        // We want to call the "bumpCount" method from the Counter class -
        // but how??!!
    }
}
