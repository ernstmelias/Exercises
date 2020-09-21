package datastructures;

import java.util.Stack;

public class TowersofHanoi {
	private Stack<Disc> leftTower;
	private Stack<Disc> middleTower;
	private Stack<Disc> rightTower;
	private int numberofDiscs;
	
	public TowersofHanoi(int N)
	{
	this.numberofDiscs = N;
	this.leftTower = new Stack<Disc>();
	this.middleTower = new Stack<Disc>();
	this.rightTower = new Stack<Disc>();
	start();
	}
	private void start()
	{
	 int discPerTower = (int) Math.floor( numberofDiscs/3);
	 int i =0;
	 int size=1;
	 while( i < discPerTower)
	 {
	   
	 }
	}

}
