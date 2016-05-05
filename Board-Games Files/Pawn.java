
/**
 * Write a description of class Pawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pawn extends ChessPiece
{
    String color;
    public Pawn(String side)
    {
        color=side;
    }
    public boolean [][] availableSpaces(int row, int col)
    {
        boolean [][] spaces=new boolean[8][8];
        for (int i=0; i<spaces.length; i++)
        {
            for (int j=0; j<spaces[0].length; j++)
            {
                spaces[i][j]=false;
            }
        }
        if (col==0)
        {
            spaces[row-1][col]=true;
            spaces[row-1][col+1]=true;
        }
        else if (col==7)
        {
            spaces[row-1][col-1]=true;
            spaces[row-1][col]=true;
        }
        else
        {
            spaces[row-1][col-1]=true;
            spaces[row-1][col]=true;
            spaces[row-1][col+1]=true;
        }
        return spaces;
    }
    public void move()
    public void take()
}
