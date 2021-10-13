package com.classroom.bootcamp;

import java.util.Scanner;

public class SqrtUsingNewtons
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to find the Sqrt");
			double number=sc.nextDouble();
			double temp;
			double sqrt=number/2;
			do
			{
				 temp=sqrt;
				 sqrt=(temp+(number/temp))/2;
				 
			}
			while((temp-sqrt!=0));
			System.out.println("the square of a given number is"+sqrt);
	}


}
