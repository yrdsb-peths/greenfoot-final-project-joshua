import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String facing = "right";
    public void act()
    {
        move(1);
        if(Greenfoot.isKeyDown("left"))
        {
            move(1);
            turn(-3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
            turn(3);
        }
        
        // Remove Humpty when eaten
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Humpty.class))
        {
            removeTouching(Humpty.class);
            MyWorld world =(MyWorld) getWorld();
            world.createHumpty();
            world.createCar();
            world.increaseScore();
        }
    }
}
