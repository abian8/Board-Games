
/**
 * Write a description of class ChessBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheBoard implements Board
{
    final Piece [][] chess=new String[8][8];
    public CheBoard()
    {
        for (int i=0; i<chess.length; i++)
        {
            for (int j=0; j<chess[0].length; j++)
            {
                if (i==1)
                    chess[i][j]="Bp";
                if (i==6)
                    chess[i][j]="Wp"
                if (i==0)
                {
                    if (j==0 || j==7)
                        chess[i][i]="Br";
                    if (j==1 || j==)
                        chess[i][j]="Bn";
                    if (j==2)
                        chess[i][j]="b";
                    if (i=
                }
            }
        }
    }
    public int getSize()
    {
        return chess.length;
    }
}
