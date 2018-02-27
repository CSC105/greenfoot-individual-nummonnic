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
   GreenfootSound sound3 = new GreenfootSound("drop.mp3");
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
        Actor diamond = getOneIntersectingObject(Diamond.class);
        if (rock != null) {
                
                World MyWorld = getWorld();
                getWorld().removeObject(rock);
                MyWorld myworld = (MyWorld)MyWorld;
                Counter counter = myworld.getCounter();
                sound3.setVolume(35);
                sound3.play();
                counter.addScore(50);
                getWorld().removeObject(this);
            }
           
            if (diamond != null) {
                
                World MyWorld = getWorld();
                getWorld().removeObject(diamond);
                MyWorld myworld = (MyWorld)MyWorld;
                Counter counter = myworld.getCounter();
                sound3.setVolume(35);
                sound3.play();
                counter.addScore(100);
                getWorld().removeObject(this);
            }
        }
        
        else {
            // I reached the top of the screen
            getWorld().removeObject(this);
        }       


    }
    
}
