/*
Megan Holmes
Krasteva
   Date: 2018
   This class is NOT a Thread!!!  There are no moving objects

*/


import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class CastleBackground
{
    //global variable used to a
    private Console c;

    //class to make background
    public void draw ()
    {
	//local colour variable for the castle floor
	Color floorblue = new Color (89, 172, 255);


	//loop used to make the floor and walls
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (floorblue);
	    c.drawRect (0, 0, x, 225);
	    c.setColor (Color.blue);
	    c.drawRect (0, 225, x, 425);
	    c.setColor (Color.white);
	    c.drawRect (0, 425, x, 500);
	}

	//loop used to create arches top
	for (int x = 0 ; x < 50 ; x++)

	    {

		c.setColor (Color.yellow);
		c.drawOval (-40, 75 - x, 99, 50);
		c.drawOval (100, 75 - x, 99, 50);
		c.drawOval (240, 75 - x, 99, 50);
		c.drawOval (380, 75 - x, 99, 50);
		c.drawOval (520, 75 - x, 99, 50);


	    }
	//loop used to create arches
	for (int x = 0 ; x < 100 ; x++)

	    {
		c.setColor (Color.yellow);
		c.drawRect (-40, 50, x, 175);
		c.drawRect (100, 50, x, 175);
		c.drawRect (240, 50, x, 175);
		c.drawRect (380, 50, x, 175);
		c.drawRect (520, 50, x, 175);

	    }
	//loop used to create flags
	for (int x = 0 ; x < 40 ; x++)

	    {
		c.setColor (Color.red);
		c.drawRect (130, 28, x, 100);
		c.drawRect (410, 28, x, 100);
	    }
	//loop used to create flags stars

	for (int x = 0 ; x < 40 ; x++)
	{
	    c.setColor (Color.blue);
	    c.drawStar (150 - x / 2, 58, x, 40);
	    c.drawStar (430 - x / 2, 58, x, 40);

	}
	//loop used to create shelves and their items
	for (int x = 0 ; x < 20 ; x++)

	    {
		c.setColor (Color.magenta);
		c.drawRect (280, 175, x, 50);
		c.drawRect (560, 175, x, 50);
		c.drawStar (290 - x / 2, 145, x, 20);
		c.drawOval (570 - x / 2, 155, x, 20);
		c.drawArc (570-x/2, 140,x, 20,180, 180);
	    }

	//commands used to detail pillars
	c.setColor (Color.blue);
	c.drawLine (80, 50, 80, 225);
	c.drawLine (220, 50, 220, 225);
	c.drawLine (360, 50, 360, 225);
	c.drawLine (500, 50, 500, 225);
	//commands used to draw wand
	c.setColor (Color.black);
	c.drawLine (290, 175, 290, 165);

    }


    public CastleBackground (Console con)
    {
	c = con;
	draw ();
    }
}


