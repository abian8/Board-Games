
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
        
    }
    public int getSize()
    {
        return tictactoe.length;
        
    }
    
    public boolean[][] availableMoves()
    {
        boolean[][] temp = new boolean[tictactoe.length][tictactoe[0].length];
        
        return temp;
    }
}
