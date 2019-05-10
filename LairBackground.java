/*
Megan Holmes
Krasteva
   This class is NOT a Thread!!!  There are no moving objects

*/


import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class LairBackground
{
    //global variable used to a
    private Console c;

    //class to make background
    public void draw ()
    {
	//local colour variable for the lairFloor
	Color floorblue = new Color (89, 172, 255);


	//loop used to make the back wall, fore ground, and speech block
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (floorblue);
	    c.drawRect (0, 275, x, 500);
	    c.setColor (Color.blue);
	    c.drawRect (0, 0, x, 275);
	    c.setColor (Color.white);
	    c.drawRect (0, 425, x, 500);
	}
	//loop used to create back wall

	for (int x = 0 ; x < 150 ; x++)
	{
	    c.setColor (Color.pink);
	    c.drawOval (0, -5 + x, 640, 125);

	}
	//loop used to create flags
	for (int x = 0 ; x < 40 ; x++)

	    {
		c.setColor (Color.red);
		c.drawRect (470, 20, x, 100);
		c.drawRect (128, 20, x, 100);
	    }
	//loop used to create floor

	for (int x = 0 ; x < 150 ; x++)
	{
	    c.setColor (floorblue);
	    c.drawOval (0, 150 + x, 640, 125);
	    c.drawOval (0, 150 + x, 640, 125);


	}
	//loop used to make side walls

	for (int x = 0 ; x < 175 ; x++)
	{
	    c.setColor (Color.blue);
	    c.drawRect (0, 35, 20, x);
	    c.drawRect (620, 35, 20, x);
	}
	//loop used to make table top
	for (int x = 0 ; x < 100 ; x++)
	{
	    c.setColor (Color.blue);
	    c.drawArc (320-x/2, 100,x, 38, 180, 180);
	}

	//commandes used to make wall accents
	c.setColor (Color.black);
	c.drawLine (65, 20, 65, 175);
	c.drawLine (575, 20, 575, 175);
	c.drawLine (405, 0, 405, 150);
	c.drawLine (235, 0, 235, 150);

	//commandes used to make table stand
	c.setColor (Color.black);
	c.drawLine (320, 175, 320, 125);
	c.drawLine (320, 175, 320, 183);
	c.drawLine (320, 175, 305, 185);
	c.drawLine (320, 175, 335, 185);


    }


    public LairBackground (Console con)
    {
	c = con;
	draw ();
    }
}


