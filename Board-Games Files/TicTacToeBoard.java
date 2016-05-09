
/**
 * Write a description of class TicTacToeBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TicTacToeBoard implements BlankInARow
{
    private int[][] tictactoe;
    private boolean[][] availableMoves=new boolean[tictactoe.length][tictactoe[0].length];;

    public TicTacToeBoard()
    {
        tictactoe = new int[3][3];
        for (int row = 0; row < tictactoe.length; row++)
        {
            for (int col = 0; col < tictactoe[0].length; col++)
            {
                tictactoe[row][col] = 0;
            }
        }

    }

    public int numInARow()
    {
        return tictactoe.length;
    }

    public int play(int row, int col, int player)
    {
        if(availableMoves[row][col]==false)
        {
            return -1;
        }
        else
        {
            tictactoe[row][col] = player;
            return player;
        }
    }

    public boolean[][] availableMoves()
    {
        for(int row=0; row<availableMoves.length; row++)
        {
            for(int col=0; col<availableMoves[0].length; col++)
            {
                if(tictactoe[row][col]==0)
                    availableMoves[row][col]=true;
                else
                    availableMoves[row][col]=false;
            }
        }
        return availableMoves;
    }

    public boolean gameOver()
    {
        //i'll do diagonal check, i know how to check the rest.
    }
}
