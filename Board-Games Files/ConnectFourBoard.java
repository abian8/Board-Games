
/**
 * Write a description of class ConnectFourBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConnectFourBoard implements Board
{
    private int [][] connectfour;

    /**
     * Constructor for objects of class ConnectFourBoard
     */
    public ConnectFourBoard()
    {
        connectfour=new int[6][7];
    }

    public boolean[][] availableMoves()
    {
        boolean [][] temp=new boolean[1][connectfour[0].length];
        for (int i=0; i<connectfour[0].length; i++)
        {
            if (connectfour[0][i]==0)
                temp[0][i]=true;
        }
        return temp;
    }
}
