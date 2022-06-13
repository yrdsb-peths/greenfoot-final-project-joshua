import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    public void act()
    {
        // Start game if user presses space.
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Label label = new Label("Jaywalking Humpty", (50));
        addObject(label,304,151);
        label.setLocation(308,91);
        Label label2 = new Label("L and R arrows to move", (30));
        addObject(label2,300,147);
        label2.setLocation(318,140);
        Label label3 = new Label("Down arrow to stop", (30));
        addObject(label3,307,172);
        label3.setLocation(316,169);
        Label label4 = new Label("PRESS SPACE TO START", (40));
        addObject(label4,308,311);
        label4.setLocation(319,315);
        Label label5 = new Label("Be Patient. Don't Get Hit!", (30));
        addObject(label5,304,232);
        label5.setLocation(311,232);
        label5.setLocation(311,232);
        Label label6 = new Label("Some people are not worth saving.", (30));
        addObject(label6,295,264);
        label6.setLocation(308,264);
    }
}
