
/**
 * Write a description of class Rook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rook extends ChessPiece
{
    String color;
    public Rook(String side)
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
        for (int i=0; i<spaces.length; i++)
            spaces[i][col]=true;
        for (int i=0; i<spaces[col].length; i++)
            spaces[row][i]=true;
    }
}
