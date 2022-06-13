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
        super(600, 400, 1, false); 
        // Hero Object
        Hero hero = new Hero();
        addObject(hero, 300, 350);
        
        // Label
        scoreLabel = new Label(0, 55);
        addObject(scoreLabel, 35, 35);
        
        //Create Humpty
        createHumpty();
        
        //Create Car
        createCar();
        createCar();
    }
    
    /**
     * Spawn ramdom Car
     */
    public void createCar()
    {
        Car car = new Car();
        int y = Greenfoot.getRandomNumber(600);
        int x = 0;
        addObject(car, x, y);
    }
    
    /**
     * End game
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Increase Score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if(score % 5 == 0)
        {
            level += 0.1;
        }
    }
    
    /**
     * Reset Score
     */
    public void decreaseScore()
    {
        scoreLabel.setValue(score - 1);
    }
    /**
     * Spawn ramdom Humpty
     */
    public void createHumpty()
    {        
        // Humpty Object
        Humpty humpty = new Humpty();
        humpty.setSpeed(level);
        int x = Greenfoot.getRandomNumber(300) + 250;
        int y = 0;
        addObject(humpty, x, y);
    }
}
