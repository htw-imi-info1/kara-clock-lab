import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This will be one Digit in the KaraClock
 */
public class DigitDisplayKara extends Kara
{
    boolean placeTrees = true;
    int stepsToNextDigit, rollOverLimit, placeValue;
    int zeroValue = 0;

    public DigitDisplayKara(){
        this(10,1,0);
        placeTrees = false;
    }

    public DigitDisplayKara(boolean placeTrees){
        this(10,1,0);
        this.placeTrees = placeTrees;
    }

    public DigitDisplayKara(int rollOverLimit, int placeValue, int stepsToNextDigit)
    {
        this.rollOverLimit = rollOverLimit;
        this.stepsToNextDigit = stepsToNextDigit;
        this.placeValue = placeValue;

    }

    public void act()
    {
    }

    /*
     * ------- replace with your methods from lab 02 : start -----------
     */
    public int moveUpAndCount(){
        return -1; // has to return something to compile
    }

    public void multiMove(int n){

    }

    /*
     * ------- replace with your methods from lab 02 : end -----------
     * ------- (don't forget the turnaround method!) -----------
     */

    public int count(){
        return 0;
    }
    
    public int increment(){
        return 0;
    }

    protected String getDisplayText(int count){
        return ""+count;
    }

    protected void addedToWorld(World world){
        initDisplay(world);
    }

    protected void placeTrees(){
        placeTrees = true;
    }

    private void initDisplay(World world){
        if (!placeTrees)
            return;
        turnLeft();
        int x = getX();
        int y = getY();
        Tree bottomTree = new Tree();
        world.addObject(bottomTree,x,y+2);
        Tree topTree = new Tree();
        world.addObject(topTree,x,y-rollOverLimit);
    }

}
