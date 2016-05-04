
/**
 * Write a description of class GoBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoBoard implements Board
{
    // instance variables - replace the example below with your own
    private int height;
    private int width;
    
    private int[][] goBoard = new int[height][width];

    /**
     * Constructor for objects of class GoBoard
     */
    public GoBoard(int height, int width)
    {
        this.height = height;
        this.width = width;
    }
    
    public int getSize()
    {
        return height;
    }

    
}
