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
    GreenfootSound sound = new GreenfootSound("start.wav");
    private boolean over;
    button1 button1 = new button1();
    overScreen overBack = new overScreen();
    private int count;
    public MyWorld()
    {    
        super(900, 600, 1);
        count = 0;
        over = false;
        addObject(new fla(),36,497);
        prepare();
        sound.setVolume(30);
        
    }

    public void checkDie(){
        if(getObjects(fla.class).size() == 0){
            over = true;
        }
    }

    public void stopMusic(){
        if(sound.isPlaying()){
            sound.stop();
        }
    }

    public Counter getCounter()
    {
        return counter;       
    }

    private void prepare(){
        addObject(counter, 100, 40);
    }

    public void checkMusic(){
        if(!sound.isPlaying()){
            sound.play();
        }
    }

    public void setOver(){
        addObject(new overScreen(),450,300);
        addObject(new Counter(),450,380);
        addObject(new button1(),450 ,500);
        stopMusic();
        count++;
    }

    public void act()
    {
        if(!over){
            checkMusic();
            checkDie();
            if (Greenfoot.getRandomNumber(500) < 8) {
                addObject(new Asteroid(), Greenfoot.getRandomNumber(880), 0);
            }
            if (Greenfoot.getRandomNumber(500) < 4) {
                addObject(new Asteroid1(), Greenfoot.getRandomNumber(880), 0);
            }
            if (Greenfoot.getRandomNumber(1000) < 2) {
                addObject(new Diamond(), 0,Greenfoot.getRandomNumber(400) );

            }
        }
        else if(over && count == 0) {
            setOver();
        }
        else {

        }
    }

}

