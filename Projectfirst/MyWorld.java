import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
    private boolean Over;
    private int count;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(900, 600, 1);
        Over = false;
        count = 0;
        addObject(new fla(),36,497);
        prepare();
        setPaintOrder(overScreen.class,button1.class,Counter.class,Asteroid.class,Asteroid1.class,fla.class);
    }

    public Counter getCounter()
    {
        return counter;       
    }

    private void prepare(){
        addObject(counter, 100, 40);
    }

    public void act()
    {
        if(!Over)
        {
            if (Greenfoot.getRandomNumber(700) < 10) {
                addObject(new Asteroid(), Greenfoot.getRandomNumber(880), 0);
            }
            if (Greenfoot.getRandomNumber(700) < 2) {
                addObject(new Asteroid1(), Greenfoot.getRandomNumber(880), 0);
            }
        }
        else if(Over && count == 0)
        {
            
        }
        else
        {
            
        }

    }

}

