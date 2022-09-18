package com.masai;

public class Cirlcle {
	public static void main(String args[])
	{
		Cirlcle d=new Cirlcle();
		d.circle(23);
		d.rectangle(2, 4);
		d.Square(5);
	}
	public void circle(int radius)
	{
		int pi=22/7;
		int ans=pi*radius*radius;
		System.out.println("Area circle ="+ans);
	}
	public void rectangle(int length , int breadth )
	{
		int ans=length*breadth;
		System.out.println("Area Rectangle ="+ans);
	}
	public void Square(int sides)
	{
		int ans=sides*sides;
		System.out.println("Area Square ="+ans);
	}
	



}
