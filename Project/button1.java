import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button1 extends restartbutton
{
    GreenfootSound sound4 = new GreenfootSound("click.mp3");
    /**
     * Act - do whatever the button1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            sound4.setVolume(55);
            sound4.play();
            Greenfoot.setWorld(new home());

    }    
        // Add your action code here.
    }    
}
