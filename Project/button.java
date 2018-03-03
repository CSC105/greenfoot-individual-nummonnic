import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button extends startbutton
{
    GreenfootSound startSound;
    GreenfootSound sound4 = new GreenfootSound("click.mp3");
    /**
     * Act - do whatever the button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public button(){
        startSound = new GreenfootSound("home.mp3");
        startSound.playLoop();
    }
    public void act() 
    { 
        if(Greenfoot.mouseClicked(this)){
            startSound.stop();
            sound4.setVolume(55);
            sound4.play();
            Greenfoot.setWorld(new MyWorld());
            Counter scores = new Counter();
            scores.score = 0;
    }    
}
}
