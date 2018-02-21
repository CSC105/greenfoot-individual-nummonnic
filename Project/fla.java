import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fla extends Actor
{
    private int speed = 12;
    private GreenfootImage run1 = new GreenfootImage("Flamingo1.png");
    private GreenfootImage run2 = new GreenfootImage("Flamingo2.png");
    private GreenfootImage run3 = new GreenfootImage("Flamingo3.png");
    private GreenfootImage run4 = new GreenfootImage("Flamingo4.png");
    private GreenfootImage run5 = new GreenfootImage("Flamingo5.png");
    private GreenfootImage run6 = new GreenfootImage("Flamingo6.png");
    private GreenfootImage run7 = new GreenfootImage("Flamingo7.png");
    private GreenfootImage run8 = new GreenfootImage("Flamingo8.png");
    private GreenfootImage run9 = new GreenfootImage("Flamingo9.png");
    private GreenfootImage run10 = new GreenfootImage("Flamingo10.png");
    private GreenfootImage run11 = new GreenfootImage("Flamingo11.png");
    private GreenfootImage run12 = new GreenfootImage("Flamingo12.png");
    private GreenfootImage run13 = new GreenfootImage("Flamingo13.png");
    private GreenfootImage run14 = new GreenfootImage("Flamingo14.png");
    private GreenfootImage run15 = new GreenfootImage("Flamingo15.png");
    private GreenfootImage run16 = new GreenfootImage("Flamingo16.png");
    private GreenfootImage run17 = new GreenfootImage("Flamingo17.png");
    private GreenfootImage run18 = new GreenfootImage("Flamingo18.png");
    private GreenfootImage run19 = new GreenfootImage("Flamingo19.png");
    private GreenfootImage run20 = new GreenfootImage("Flamingo20.png");
    private GreenfootImage run21 = new GreenfootImage("Flamingo21.png");
    private GreenfootImage run22 = new GreenfootImage("Flamingo22.png");
    private GreenfootImage run23 = new GreenfootImage("Flamingo23.png");
    private GreenfootImage run24 = new GreenfootImage("Flamingo24.png");
    private GreenfootImage run25 = new GreenfootImage("Flamingo25.png");
    private GreenfootImage run26 = new GreenfootImage("Flamingo26.png");
    private GreenfootImage run27 = new GreenfootImage("Flamingo27.png");
    private GreenfootImage run28 = new GreenfootImage("Flamingo28.png");
    private GreenfootImage run29 = new GreenfootImage("Flamingo29.png");
    private GreenfootImage run30 = new GreenfootImage("Flamingo30.png");
    private GreenfootImage run31 = new GreenfootImage("Flamingo31.png");
    private GreenfootImage run32 = new GreenfootImage("Flamingo32.png");
    private GreenfootImage run33 = new GreenfootImage("Flamingo33.png");
    private GreenfootImage run34 = new GreenfootImage("Flamingo34.png");
    private GreenfootImage run35 = new GreenfootImage("Flamingo35.png");
    private GreenfootImage run36 = new GreenfootImage("Flamingo36.png");
    private int frame = 1;
    private int animationCounter = 0;
    private int shotTimer = 0;
    /**
     * Act - do whatever the fla1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKey();
        animationCounter++;
        if (shotTimer > 0) {
            shotTimer = shotTimer - 1;
        }
        else if (Greenfoot.isKeyDown("space")) {
            getWorld().addObject(new Shoot(this), getX(), getY());
            shotTimer = 10; // delay next shot
        }
    
        // Add your action code here.
    }    
    public void checkKey()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            moveRight();
    }
    else if(Greenfoot.isKeyDown("left"))
    {
        moveLeft();
}
}
  
    public void moveLeft()
    {
        setLocation(getX()-speed, getY());
        if(animationCounter % 0.5 == 0)
        animateLeft();
    }
    public void animateLeft()
    {
        if(frame == 36)
    {
          setImage(run36);  
    }
    else if(frame == 2)
    {
        setImage(run2);
    }
    else if(frame == 3)
    {
        setImage(run3);
    }
    else if(frame == 4)
    {
        setImage(run4);
    }
    else if(frame == 5)
    {
        setImage(run5);
    }
    else if(frame == 6)
    {
        setImage(run6);
    }
    else if(frame == 7)
    {
        setImage(run7);
    }
    else if(frame == 8)
    {
        setImage(run8);
    }
    else if(frame == 9)
    {
        setImage(run9);
    }
    else if(frame == 10)
    {
        setImage(run10);
    }
    else if(frame == 11)
    {
        setImage(run11);
    }
    else if(frame == 12)
    {
        setImage(run12);
    }
    else if(frame == 13)
    {
        setImage(run13);
    }
    else if(frame == 14)
    {
        setImage(run14);
    }
    else if(frame == 15)
    {
        setImage(run15);
    }
    else if(frame == 16)
    {
        setImage(run16);
    }
    else if(frame == 17)
    {
        setImage(run17);
    }
    else if(frame == 18)
    {
        setImage(run18);
    }
    else if(frame == 19)
    {
        setImage(run19);
    }
    else if(frame == 20)
    {
        setImage(run20);
    }
    else if(frame == 21)
    {
        setImage(run21);
    }
    else if(frame == 22)
    {
        setImage(run22);
    }
    else if(frame == 23)
    {
        setImage(run23);
    }
    else if(frame == 24)
    {
        setImage(run24);
    }
    else if(frame == 25)
    {
        setImage(run25);
    }
    else if(frame == 26)
    {
        setImage(run26);
    }
    else if(frame == 27)
    {
        setImage(run27);
    }
    else if(frame == 28)
    {
        setImage(run28);
    }
    else if(frame == 29)
    {
        setImage(run29);
    }
    else if(frame == 30)
    {
        setImage(run30);
    }
    else if(frame == 31)
    {
        setImage(run31);
    }
    else if(frame == 32)
    {
        setImage(run32);
    }
    else if(frame == 33)
    {
        setImage(run33);
    }
    else if(frame == 34)
    {
        setImage(run34);
    }
    else if(frame == 35)
    {
        setImage(run35);
    }
    else if(frame == 1)
    {
        setImage(run1);
        frame =36;
        return;
    }
    frame--;
}
    public void moveRight()
    {
        setLocation(getX()+speed, getY());
        if(animationCounter % 1 == 0)
        animateRight();
    }
    public void animateRight()
    {
        if(frame == 1)
    {
          setImage(run1);  
    }
    else if(frame == 2)
    {
        setImage(run2);
    }
    else if(frame == 3)
    {
        setImage(run3);
    }
    else if(frame == 4)
    {
        setImage(run4);
    }
    else if(frame == 5)
    {
        setImage(run5);
    }
    else if(frame == 6)
    {
        setImage(run6);
    }
    else if(frame == 7)
    {
        setImage(run7);
    }
    else if(frame == 8)
    {
        setImage(run8);
    }
    else if(frame == 9)
    {
        setImage(run9);
    }
    else if(frame == 10)
    {
        setImage(run10);
    }
    else if(frame == 11)
    {
        setImage(run11);
    }
    else if(frame == 12)
    {
        setImage(run12);
    }
    else if(frame == 13)
    {
        setImage(run13);
    }
    else if(frame == 14)
    {
        setImage(run14);
    }
    else if(frame == 15)
    {
        setImage(run15);
    }
    else if(frame == 16)
    {
        setImage(run16);
    }
    else if(frame == 17)
    {
        setImage(run17);
    }
    else if(frame == 18)
    {
        setImage(run18);
    }
    else if(frame == 19)
    {
        setImage(run19);
    }
    else if(frame == 20)
    {
        setImage(run20);
    }
    else if(frame == 21)
    {
        setImage(run21);
    }
    else if(frame == 22)
    {
        setImage(run22);
    }
    else if(frame == 23)
    {
        setImage(run23);
    }
    else if(frame == 24)
    {
        setImage(run24);
    }
    else if(frame == 25)
    {
        setImage(run25);
    }
    else if(frame == 26)
    {
        setImage(run26);
    }
    else if(frame == 27)
    {
        setImage(run27);
    }
    else if(frame == 28)
    {
        setImage(run28);
    }
    else if(frame == 29)
    {
        setImage(run29);
    }
    else if(frame == 30)
    {
        setImage(run30);
    }
    else if(frame == 31)
    {
        setImage(run31);
    }
    else if(frame == 32)
    {
        setImage(run32);
    }
    else if(frame == 33)
    {
        setImage(run33);
    }
    else if(frame == 34)
    {
        setImage(run34);
    }
    else if(frame == 35)
    {
        setImage(run35);
    }
    else if(frame == 36)
    {
        setImage(run36);
        frame =1;
        return;
    }
    frame++;
}
}