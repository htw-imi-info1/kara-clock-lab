import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World7Increment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DigitalNumber extends World
{

    private static final int WORLD_WIDTH = 20;  // Number of horizontal cells
    private static final int WORLD_HEIGHT = 20;  // Number of vertical cells
    private static final int SPEED = 40;
    private static final int CELL_SIZE = 28; // Size of one cell
    private static final int BASELINE = 15;
    private static final int RIGHT = 13;
    private static final int NUMBER_OF_DIGITS = 10;
    private static final int BASE = 10;

    private static final int LIMIT = 10;

    public DigitalNumber()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WORLD_WIDTH, WORLD_HEIGHT, CELL_SIZE);
        Greenfoot.setSpeed(SPEED);
        setPaintOrder(Kara.class, Tree.class, Mushroom.class, Leaf.class);

        Greenfoot.setSpeed(40);

        showText("DigitalNumber", 8, BASELINE-LIMIT-3);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        prepareColumns();
        DisplayKara callingKara = new DisplayKara(2);
        addObject(callingKara,15,16);
        callingKara.turnLeft();
        callingKara.turnLeft();
        Tree tree19 = new Tree();
        addObject(tree19,16,16);
    }
    DigitDisplayKara kara = null;
    private void prepareColumns(){
        for (int i = 0; i< NUMBER_OF_DIGITS-1; i++){
            int column = RIGHT-i;
            long placeValue = (long)Math.pow(BASE,i);

            kara = new DigitDisplayKara(BASE,placeValue,1);
            addObject(kara,column,BASELINE);
        }
        kara.setStepsToNextDigit(0); // last Kara
    }
}
