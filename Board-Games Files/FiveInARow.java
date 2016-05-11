
/**
 * Write a description of class FiveInARow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FiveInARow implements BlankInARow
{
    private int[][] fiveInARow;
    private boolean[][] availableMoves;
    private int playerCount;

    
    public FiveInARow()
    {
        fiveInARow = new int[19][19];
        availableMoves = new boolean[19][19];
        playerCount = 0;
        for (int row = 0; row < fiveInARow.length; row++)
        {
            for (int col = 0; col < fiveInARow[0].length; col++)
            {
                fiveInARow[row][col] = 0;
            }
        }
        
    }
    
    public int numInARow()
    {
        return 5;
    }
    
    public int getPlayer()
    {
        return playerCount%2 + 1;
    }
    
    public int getWinner()
    {
        return (playerCount - 1) % 2 + 1;
    }

    public int play(int row, int col)
    {
        int playNumber = playerCount % 2 + 1;
        
        
        return 1;
    }
    
    public boolean[][] availableMoves()
    {
        for(int row=0; row<availableMoves.length; row++)
        {
            for(int col=0; col<availableMoves[0].length; col++)
            {
                if(fiveInARow[row][col]==0)
                    availableMoves[row][col]=true;
                else
                    availableMoves[row][col]=false;
            }
        }
        return availableMoves;
    }
    
    public int gameOver()
    {
        return 1;
    }
    
}
