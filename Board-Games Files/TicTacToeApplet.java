import java.awt.*;
import javax.swing.*;
import java.*;


/**
 * Write a description of class TicTacToeApplet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TicTacToeApplet extends JApplet
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class TicTacToeApplet
     */
    public TicTacToeApplet()
    {
        // initialise instance variables
        x = 0;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void paint(Graphics g)
    {
        g.drawLine(10,10,10,10);
    }
    
    
}
