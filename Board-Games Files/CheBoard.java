
/**
 * Write a description of class ChessBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheBoard implements Board
{
    private final ChessPiece [][] chess=new String[8][8];
    public CheBoard()
    {
        for (int i=0; i<chess.length; i++)
        {
            for (int j=0; j<chess[0].length; j++)
            {
                if (i==1)
                    chess[i][j]=new Pawn("black");
                if (i==6)
                    chess[i][j]=new Pawn("white");
                if (i==0)
                {
                    if (j==0 || j==7)
                        chess[i][i]=new Rook("black");
                    if (j==1 || j==6)
                        chess[i][j]=new Knight("black");
                    if (j==3 || j==5)
                        chess[i][j]=new Bishop("black");
                    if (i==4)
                        chess[i][j]=new Queen("black");
                    if (i==5)
                        chess[i][j]=new King("black");
                }
                if (i==7)
                {
                    if (j==0 || j==7)
                        chess[i][i]=new Rook("white");
                    if (j==1 || j==6)
                        chess[i][j]=new Knight("white");
                    if (j==3 || j==5)
                        chess[i][j]=new Bishop("white");
                    if (i==5)
                        chess[i][j]=new Queen("white");
                    if (i==4)
                        chess[i][j]=new King("white");
                }
            }
        }
    }
    public int getSize()
    {
        return chess.length;
    }
}
