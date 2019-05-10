/*
   Name: xxx
   Teacher: Ms. Dyke
   Date: xxxx
   Assignment: Simple thread example.  MyCreation.java runs the other classes.
   DO NOT put any draw cmds etc in this file!!!
   NOTE:  each class should be organized into several methods
   which are then executed by the run() method
   The fairyEnter class demonstrates an OVERLOADED constructor which enables the programmer to create only 1 class but
   alter it in many ways.

*/

// The "MyCreation" class.
import java.awt.*;
import hsa.Console;


public class MyCreation
{
    Console c;           // The output console

    //adds the Background thread to MyCreation
    public void CastleBackground ()
    {
	//not a thread because it's not animated!!!
	CastleBackground b = new CastleBackground (c);
    }


    public void LairBackground ()
    {
	//not a thread because it's not animated!!!
	c.clear ();
	LairBackground b = new LairBackground (c);
    }


    public void MapBackground ()
    {
	//not a thread because it's not animated!!!
	c.clear ();
	MapBackground b = new MapBackground (c);
    }


    public void DoorBackground ()
    {
	//not a thread because it's not animated!!!
	c.clear ();
	DoorBackground b = new DoorBackground (c);
    }


    //adds the fairyEnter thread to MyCreation
    public void fairyEnter ()
    {
	//creates the cloud thread
	//comment out 2 of the 3 instances to see how the overloads work
	fairyEnter h = new fairyEnter (c);
	//starts the thread
	h.start ();
	fairyEnter h1 = new fairyEnter (c, Color.green);
	//starts the thread
	h1.start ();
	fairyEnter h2 = new fairyEnter (c, Color.red, 200);
	//starts the thread
	h2.start ();
    }


    //
    //
    //
    //
    //
    // //adds the Lightning thread to MyCreation
    // public void lightning ()
    // {
    //     //creates the thread
    //     Lightning j = new Lightning (c);
    //     //starts the thread
    //     j.start ();
    //
    //     //joins with SinkingBoat thread so that it only executes when lightning thread is done
    //     try
    //     {
    //         j.join ();
    //     }
    //     catch (InterruptedException e)
    //     {
    //     }
    // }
    //
    //
    // //adds the SinkingBoat thread to MyCreation
    // public void sinkingBoat ()
    // {
    //     //creates the thread
    //     SinkingBoat i = new SinkingBoat (c);
    //     //starts the thread
    //     i.run ();
    // }


    //creates a new window and gives window a title
    public MyCreation ()
    {
	c = new Console ("Mira's Quest");
    }


    public static void main (String[] args)
    {
	MyCreation z = new MyCreation ();
	//z.CastleBackground ();
	//z.MapBackground ();
	//z.LairBackground ();
	//z.fairyEnter ();
	z.DoorBackground ();
    }
} // MyCreation class



