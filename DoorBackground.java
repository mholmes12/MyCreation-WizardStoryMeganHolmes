/*
Megan Holmes
Krasteva
   Date: xxxx
   This class is NOT a Thread!!!  There are no moving objects

*/


import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class DoorBackground
{
    //global variable used to a
    private Console c;

    //class to make background
    public void draw ()
    {
	//local colour variable for the map
	// Color grassGreen = new Color (0, 224, 122);
	// Color castleBlue = new Color (204, 229, 255);
	// Color castleTopBlue = new Color (153, 204, 255);
	// Color castleFrontBlue = new Color (102, 178, 255);
	// Color flameRed = new Color (255, 178, 0);
	// Color lairBlack = new Color (51, 0, 25);
	// Color treeGreen = new Color (51, 102, 0);
	Color trunkBrown = new Color (102, 31, 0);
	Color boltGrey = new Color (64, 64, 64);



	//loop used to make the floor and walls
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (trunkBrown);
	    c.drawRect (0, 0, x, 500);
	}
	
	//loop used to make the bolts
	for (int x = 20 ; x > 0 ; x--)
	{
	    c.setColor (boltGrey);
	    c.drawRect (30-x/2, 150, x, 20);
	}

	
    }


    public DoorBackground (Console con)
    {
	c = con;
	draw ();
    }
}


