import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Person for Hero to Save.
 * 
 * @author (Joshua) 
 * @version (June 2022)
 */
public class Humpty extends Actor
{
    /**
     * Act - do whatever the Humpty wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] idle = new GreenfootImage[10];
    int speed = 1;
    
    /**
     * Constructor - Code runs one time when object is created
     */
    public Humpty()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/humpty_idle/idle" + i + ".png");
            idle[i].scale(50,50);
        }
        setImage(idle[0]);
    }
    
    /**
     * Animate Humpty
     */
    int imageIndex = 0;
    public void animateHumpty()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + speed);
        
        // Remove humpty when it crosses road
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
        }
        
        // Animate Humpty
        animateHumpty();
        
        //Decrese score if Humpty gets it by car
        if(isTouching(Car.class))
        {
            world.removeObject(this);
            world.createHumpty();
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;  
    }
}
