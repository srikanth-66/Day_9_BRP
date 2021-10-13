package com.classroom.bootcamp;

public class MathFunctions
{
	public static void harmonic()
	{
		double n=10,i;
		double sum=0;	
		for( i=1;i<=n;i++)
		{
			sum=sum+(1/i);
		}
		System.out.println("Harmonic value = "+sum);
	}
	public static void sinAngle()
	{
		double a=90.0;
        double angle = Math.toRadians(a);
        System.out.println("sin"+"("+a+")"+"="+Math.sin(angle));

		
	}
	public static void cosineAngle()
	{
		double a=0;
        double angle = Math.toRadians(a);
        System.out.println("cosine"+"("+a+")"+"="+Math.cos(angle));
	}
	public static void toBinary(int decimal)
	{
	     int binary[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	     }    
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }    
	     System.out.println();  
	}
	public static void main(String[] args)
	{
	    System.out.println("Harmonic");  
		harmonic();
	    System.out.println("sin angle");  
		sinAngle();
	    System.out.println("cos Angle");  
		cosineAngle();
	    System.out.println("decimal to binary");  
		toBinary(10);
		
	}

}
