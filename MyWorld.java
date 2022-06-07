import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world of the game.
 * 
 * @author (Joshua) 
 * @version (June 2022)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        // Hero Object
        Hero hero = new Hero();
        addObject(hero, 300, 350);
        
        // Label
        scoreLabel = new Label(0, 55);
        addObject(scoreLabel, 35, 35);
        
        //Create Humpty
        createHumpty();
    }
    
    /**
     * Increase Score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * Spawn ramdom Humpty
     */
    public void createHumpty()
    {        
        // Humpty Object
        Humpty humpty = new Humpty();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(humpty, x, y);
    }
}
