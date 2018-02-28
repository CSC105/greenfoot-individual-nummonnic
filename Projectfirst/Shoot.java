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
        Actor rock1 = getOneIntersectingObject(Asteroid1.class);
        
        if (rock != null) {
                // We've hit an asteroid!
                //hitAnAsteroid();
                //hitDiamond();
                World MyWorld = getWorld();
                getWorld().removeObject(rock);
                MyWorld myworld = (MyWorld)MyWorld;
                Counter counter = myworld.getCounter();
                counter.addScore(50);
                getWorld().removeObject(this);
            }
            if (rock1 != null) {
                // We've hit an asteroid!
                //hitAnAsteroid();
                //hitDiamond();
                World MyWorld = getWorld();
                getWorld().removeObject(rock1);
                MyWorld myworld = (MyWorld)MyWorld;
                Counter counter = myworld.getCounter();
                counter.addScore(70);
                getWorld().removeObject(this);
            }
            
        }
        
        else {
            // I reached the top of the screen
            getWorld().removeObject(this);
        }       


    }
    private void hitDiamond()
    {
        // What goes here????
        // We want to call the "bumpCount" method from the Counter class -
        // but how??!!
    }
    private void hitAnAsteroid()
    {
        // What goes here????
        // We want to call the "bumpCount" method from the Counter class -
        // but how??!!
    }
}
