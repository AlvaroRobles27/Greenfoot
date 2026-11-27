import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * In my world, there will be an adventurer, who has arrived on a new planet,
 * on which infinite fruits fall from the sky, and also ...
 *
 * @author Alvaro
 * @version alfa 1
 */
public class FruitPlanet extends World
{
    /**
     * Constructor for objects of class FruitPlanet.
     */
    public FruitPlanet()
    {
        // Create a new world with 600x400 cells.
        super(600, 400, 1);

        // Create an instance of class Player.
        Player babyAdventurer = new Player();

        // Add the player to the world.
        addObject(babyAdventurer, 0, 0);
        
        //Creo una fila de abejas separadas de la misma distacia
        
        int initX = 30;
        int initY = 50;
        
        
        crearFilaAbejas(5, initY);
        initY = initY + 50;
        crearFilaAbejas(5, initY);
        initY = initY + 50;
        crearFilaAbejas(5, initY);
        initY = initY + 50;
        
        showText("value of y " + initY, 100, 100);
        
        for(int i = 0; i < 4; i++){
        crearFilaAbejas(5, initY);
        initY = initY + 50;
        }

    }

    /**
     * Method to create a row of bees with equal distance.
     *
     * @param cantidad Number of bees to create.
     * @param altura Vertical position of the bees.
     */
    public void crearFilaAbejas(int cantidad, int altura)
    {
        for (int i = 0; i < cantidad; i++)
        {
            int x = (i + 1) * getWidth() / (cantidad + 1);
            addObject(new Bee(), x, altura);
        }
    }
}