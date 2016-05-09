
/**
 * Write a description of class TicTacToeBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TicTacToeBoard implements BlankInARow
{
    private int[][] tictactoe;
    private boolean[][] availableMoves;
    private int playerCount;

    public TicTacToeBoard()
    {
        tictactoe = new int[3][3];
        availableMoves = new boolean [3][3];
        playerCount = 0;
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

    public int getPlayer()
    {
        return playerCount%2 + 1;
    }
    
    public int getWinner()
    {
        return (playerCount-1) % 2 + 1;
    }
    
    public int play(int row, int col)
    {
        int playNumber = playerCount%2 + 1;
        availableMoves = availableMoves();
        if(availableMoves[row][col]==false)
        {
            return -1;
        }
        else
        {
            tictactoe[row][col] = playNumber;
            playerCount++;
        }
        return playNumber;
        
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
        boolean a = true;
        
        // checks to see if there are any moves left
        for(int row = 0; row < tictactoe.length; row++)
        {
            for (int col = 0; col < tictactoe[0].length; col++)
            {
                if (tictactoe [row][col] == 0)
                {
                    return false;
                }
            }
        }
        
        for (int[] row : tictactoe)
        {
            if (row[0] == row[1] && row[0] == row[2])
            {
                return true;
            }
            
        }
        
        
        
        return a;
    }
}
