import java.util.*;
/**
 * Write a description of class TicTacToeRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TicTacToeRunner
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        String str;
        int row=0, col=0, indexOfComma;
        System.out.println("Enter the coordinates of the square in the format #,# seperated by a comma with no space");
        Scanner sc = new Scanner(System.in);
        TicTacToeBoard hi = new TicTacToeBoard();
        
        while(hi.gameOver()==-1)
        {
            System.out.print("Player " + hi.getPlayer() + ", please make a move: ");
            str = sc.nextLine();
            indexOfComma=str.indexOf(",");
            while(indexOfComma==-1 || (Integer.parseInt(str.substring(0,indexOfComma))>3 || Integer.parseInt(str.substring(0,indexOfComma))<0))


            {
                System.out.print("Invalid move. Player " + hi.getPlayer() + ", please make a legal move: ");
                str=sc.nextLine();
                indexOfComma=str.indexOf(",");
            }
            row=Integer.parseInt(str.substring(0,indexOfComma)) - 1;
            col=Integer.parseInt(str.substring(indexOfComma+1)) - 1;
            hi.play(row,col);
            
        }
        if(hi.gameOver()==0)
        {
            System.out.println("The game is a tie!");
        }
        else
        {
            System.out.println("Player " + hi.gameOver() + " wins!");
        }
        
    }
}
