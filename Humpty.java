import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for Hero.
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
    int speed = 1;
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + speed);
        
        // Remove humpty when it crosses road
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
        
    }
}
