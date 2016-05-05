
/**
 * Write a description of class TicTacToeBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TicTacToeBoard implements Board
{
    private int[][] tictactoe;
    
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
    public int getSize()
    {
        return tictactoe.length;
        
    }
    
    public void play(int row, int col, int player)
    {
        tictactoe[row][col] = 1;
        
    }
    
   
    
    public boolean[][] availableMoves()
    {
        boolean[][] temp = new boolean[tictactoe.length][tictactoe[0].length];
        
        return temp;
    }
}
