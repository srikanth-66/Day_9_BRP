package com.classroom.bootcamp;

import java.util.Scanner;

public class FutureValue 
{
	private static double compoundIntrest(double capital,double rateofintrst,double time)
	{
	      double comp_int = capital *(Math.pow((1 + rateofintrst / 100), time));
		return comp_int;
	}
	public static void main(String[] args) 
	{
		FutureValue fv=new FutureValue();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter capital");
		double capital=sc.nextDouble();
		System.out.println("enter rate of intrest");
		double rate=sc.nextDouble();
		System.out.println("enter time period");
		double time=sc.nextDouble();
		double futurevalue=compoundIntrest(capital,rate,time);
		System.out.println("the compound intrest is"+futurevalue);
		
		
	}

}
