import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (Joshua) 
 * @version (June 2022)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * Car Spawns in random location at the top.
     */
    int speed = 3;
    public void act()
    {
        setLocation(getX() + speed, getY());
    }
}
