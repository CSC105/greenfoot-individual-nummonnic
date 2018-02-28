import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class total here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class total extends End
{
    World MyWorld = getWorld();
    MyWorld temp = (MyWorld)MyWorld();
    Counter Score = temp.getScore();
    int total1 = Score.getPoint();
    /**
     * Act - do whatever the total wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      setImage(new GreenfootImage("Score : " + total1, 50, Color.WHITE , Color.PINK));  
    }        
}
