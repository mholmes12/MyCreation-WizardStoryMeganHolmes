/*
 Megan Holmes
 Krasteva
 2018
This class is has 3 overloaded constructors!!!
The basic constructor creates a fairy in a specific predetermined location.
The 2nd constructor allows a parameter pass to change the fairy color.
The 3rd constructor creates a fairy with a specific color and a time delay to
control the speed of its movement during the animation.

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class fairyEnter extends Thread
{
    private Console c;
    private Color fairy;
    private int delay = 50;

    public void fairy ()
    {
	//local colour variable used for sky
	Color skyblue = new Color (89, 172, 255);
	//loop used to animate the storm fairy
	for (int x = 0 ; x < 300 ; x++)
	{
	    c.setColor (Color.red);
	    c.fillRect (-6 + x, 445, 35, 65);
	    c.setColor (skyblue);
	    c.fillOval (0 + x, 450, 20, 20);
	    c.fillOval (-5 + x, 445, 10, 10);
	    c.fillOval (15 + x, 445, 10, 10);
	    c.fillRect (5 + x, 470, 10, 20);
	    c.setColor (Color.magenta);
	    c.fillArc (-5 + x, 470, 20, 10, 90, 180);
	    c.fillArc (-5 + x, 478, 20, 10, 90, 180);
	    c.fillArc (5 + x, 470, 20, 10, 270, 180);
	    c.fillArc (5 + x, 478, 20, 10, 270, 180);


	    // //used to delay the animation
	    // try
	    // {
	    //     sleep (delay);
	    // }
	    // catch (Exception e)
	    // {
	    // }
	}
    }


    //basic fairy
    public fairyEnter (Console con)
    {
	c = con;
	fairy = new Color (149, 149, 149);
    }


    // fairy with a Color parameter
    public fairyEnter (Console con, Color n)
    {
	c = con;
	fairy = n;

    }


    // fairy with a Color parameter, and a new delay time
    public fairyEnter (Console con, Color n, int t)
    {
	c = con;
	fairy = n;
	delay = t;

    }


    public void run ()
    {
	fairy ();
    }
}


