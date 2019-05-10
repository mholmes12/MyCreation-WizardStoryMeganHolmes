/*
Megan Holmes
Krasteva
   Date: 2018
   This class is NOT a Thread!!!  There are no moving objects

*/


import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class MapBackground
{
    //global variable used to a
    private Console c;

    //class to make background
    public void draw ()
    {
	//local colour variable for the map
	Color grassGreen = new Color (0, 224, 122);
	Color castleBlue = new Color (204, 229, 255);
	Color castleTopBlue = new Color (153, 204, 255);
	Color castleFrontBlue = new Color (102, 178, 255);
	Color flameRed = new Color (255, 178, 0);
	Color lairBlack = new Color (51, 0, 25);
	Color treeGreen = new Color (51, 102, 0);
	Color trunkBrown = new Color (102, 31, 0);



	//loop used to make the floor and walls
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (grassGreen);
	    c.drawRect (0, 0, x, 500);
	}

	//loop used to create towers
	for (int x = 0 ; x < 130 ; x++)

	    {

		c.setColor (castleBlue);
		c.drawRect (60, 25, 30, x);
		c.drawRect (160, 25, 30, x);

	    }
	//loop used to create centre tower
	for (int x = 0 ; x < 90 ; x++)

	    {

		c.setColor (castleBlue);
		c.drawRect (110, 65, 25, x);

	    }
	//loop used to create castle front turrets
	for (int x = 0 ; x < 10 ; x++)
	{
	    c.setColor (castleFrontBlue);
	    c.drawRect (61, 95, x, 40);
	    c.drawRect (80, 95, x, 40);
	    c.drawRect (100, 95, x, 40);
	    c.drawRect (120, 95, x, 40);
	    c.drawRect (140, 95, x, 40);
	    c.drawRect (160, 95, x, 40);
	    c.drawRect (180, 95, x, 40);
	}
	//loop used to create castle front turrets
	for (int x = 0 ; x < 120 ; x++)

	    {
		c.setColor (castleFrontBlue);
		c.drawRect (66, 115, x, 40);

	    }
	//loop used to create tower tops
	for (int i = 25 ; i > 0 ; i--)
	{
	    c.setColor (castleTopBlue);
	    int[] x = {60, 75, 90};
	    int[] y = {25, i, 25};
	    int[] x2 = {160, 175, 190};
	    int[] y2 = {25, i, 25};
	    int[] x3 = {110, 122, 135};
	    int[] y3 = {65, 65 - i, 65};
	    c.drawPolygon (x, y, 3);
	    c.drawPolygon (x2, y2, 3);
	    c.drawPolygon (x3, y3, 3);
	}

	//loop used to create lair spikes
	for (int i = 125 ; i > 0 ; i--)
	{
	    c.setColor (flameRed);
	    int[] x = {460, 480, 500};
	    int[] y = {375, 350 - i, 345};
	    int[] x2 = {510, 545, 565};
	    int[] y2 = {375, 350 - i, 345};
	    int[] x3 = {540, 580, 585};
	    int[] y3 = {375, 400 - i, 405};
	    int[] x4 = {420, 440, 475};
	    int[] y4 = {345, 350 - i, 375};
	    int[] x5 = {420, 405, 465};
	    int[] y5 = {405, 410 - i, 385};
	    c.drawPolygon (x, y, 3);
	    c.drawPolygon (x2, y2, 3);
	    c.drawPolygon (x3, y3, 3);
	    c.drawPolygon (x4, y4, 3);
	    c.drawPolygon (x5, y5, 3);


	}

	//loop used to create skull lair
	for (int i = 100 ; i > 0 ; i--)
	{
	    c.setColor (lairBlack);
	    c.drawOval (500 - i / 2, 300, i, 100);
	    c.drawRect (470, 320, 60, i);
	}


	//loop used to create skull details
	for (int i = 20 ; i > 0 ; i--)
	{
	    c.setColor (Color.black);
	    c.drawOval (520 - i / 2, 340, i, 20);
	    c.drawOval (480 - i / 2, 340, i, 20);
	    c.drawRect (490, 400, 20, i);
	}

	//loop used to create tree trunks
	for (int i = 0 ; i < 20 ; i++)
	{
	    c.setColor (trunkBrown);
	    c.drawRect (330, 160, i, 80);
	    c.drawRect (170, 390, i, 80);
	    c.drawRect (60, 260, i, 80);

	}

	//loop used to create tree tops
	for (int i = 40 ; i > 0 ; i--)
	{
	    c.setColor (treeGreen);
	    c.drawOval (320 - i / 2, 140, i, 40);
	    c.drawOval (340 - i / 2, 120, i, 40);
	    c.drawOval (350 - i / 2, 160, i, 40);
	    c.drawOval (320 - i / 2, 150, i, 40);
	    c.drawOval (360 - i / 2, 140, i, 40);

	    c.drawOval (180 - i / 2, 380, i, 40);
	    c.drawOval (180 - i / 2, 340, i, 40);
	    c.drawOval (200 - i / 2, 360, i, 40);
	    c.drawOval (160 - i / 2, 370, i, 40);
	    c.drawOval (160 - i / 2, 350, i, 40);

	    c.drawOval (70 - i / 2, 220, i, 40);
	    c.drawOval (40 - i / 2, 240, i, 40);
	    c.drawOval (85 - i / 2, 250, i, 40);
	    c.drawOval (60 - i / 2, 255, i, 40);
	}

    }


    public MapBackground (Console con)
    {
	c = con;
	draw ();
    }
}


