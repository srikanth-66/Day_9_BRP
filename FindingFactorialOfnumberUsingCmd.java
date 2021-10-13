package com.classroom.bootcamp;

public class FindingFactorialOfnumberUsingCmd
{
	public  static long fatorial(long num)
	{
		if(num==0)
			return 1;
		else return num*fatorial(num-1);
	}
	public static void main(String[] args) 
	{
		FindingFactorialOfnumberUsingCmd f=new FindingFactorialOfnumberUsingCmd();
		int num=Integer.parseInt(args [0]);
		//int num=5;
		long fact=fatorial(num);
		System.out.println("factorial of "+num+"is"+"="+fact);
		
	}

}
