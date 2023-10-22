import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This will be one Digit in the KaraClock
 */
public class DigitDisplayKara extends Kara
{
    boolean placeTrees = true;
    int stepsToNextDigit, rollOverLimit;
    long placeValue;
    int zeroValue = 0;

    public DigitDisplayKara(){
        this(10,1,0);
        placeTrees = false;
    }

    public DigitDisplayKara(boolean placeTrees){
        this(10,1,0);
        this.placeTrees = placeTrees;
    }

    public DigitDisplayKara(int rollOverLimit, long placeValue, int stepsToNextDigit)
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

    public void initialize(int leaves){

    }

    public String getDisplayText(int count){
        return ""+count;
    }

    /*
     * 
     * You don't need to change anything in the methods below.
     * 
     * 
     * 
     */

    public void setPlaceTrees(boolean doPlaceTrees){
        placeTrees = doPlaceTrees;
    }

    public void setStepsToNextDigit(int i){
        stepsToNextDigit = i;
    }

    public int getStepsToNext(){
        return stepsToNextDigit;
    }

    public long getPlaceValue(){
        return placeValue;
    }

    public int getRollOverLimit(){
        return rollOverLimit;
    }

    protected void addedToWorld(World world){
        addTrees(world);
    }

    private void addTrees(World world){
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
