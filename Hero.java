import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (Joshua) 
 * @version (June 2022)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound crash = new GreenfootSound("crash.wav");
    GreenfootSound save = new GreenfootSound("savehat.wav");
    
    String facing = "right";
    public void act()
    {
        move();
        
        // Remove Humpty when eaten
        eat();
        
        //End game if Hero gets it by car
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Car.class))
        {
            world.gameOver();
            world.removeObject(this);
            crash.play();
        }
    }
    
    public void move()
    {
        move(1);
        if(Greenfoot.isKeyDown("left"))
        {
            move(1);
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(1);
            turn(3);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            move(-1);
        }
    }
    public void eat()
    {
        if(isTouching(Humpty.class))
        {
            removeTouching(Humpty.class);
            MyWorld world =(MyWorld) getWorld();
            world.createHumpty();
            world.createCar();
            world.createCar();
            world.increaseScore();
            save.play();
        }
    }
}
