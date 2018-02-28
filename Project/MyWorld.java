import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static Counter Score = new Counter();
    int point;
    Counter newScore = new Counter();
    public MyWorld()
    {    
        super(900, 600, 1); 
        addObject(new fla(),36,497);
        prepare();
    }
    public static Counter getScore(){
        return Score;
    }
    public int getPoint(){
        return point;
    }
    
    //public static Counter getCounter()
    //{
       //return counter;       
    //}
    private void prepare(){
        addObject(Score, 100, 40);
    }
    public void act()
    {
 
        if (Greenfoot.getRandomNumber(500) < 15) {
            addObject(new Asteroid(), Greenfoot.getRandomNumber(880), 0);
        }
        if (Greenfoot.getRandomNumber(500) < 4) {
            addObject(new Asteroid1(), Greenfoot.getRandomNumber(880), 0);
        }
    }

}

