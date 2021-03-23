package tester;

import java.util.Scanner;

public class denklemmetho {
	
	
	public static double diskiminant(double a, double b, double c)
	{
		double delta; 
		return  delta =  (Math.pow(b, 2)-(4*a*c));
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		double a,b,c;
		Scanner tara = new Scanner(System.in); 
		System.out.println("Degerleri giriniz: ");
		a=tara.nextDouble();
		b=tara.nextDouble(); 
		c=tara.nextDouble(); 
		
		double delta = diskiminant(a, b, c); 
		 
		if (delta>0 )
		{
			double x1,x2; 
			
			
			
			x1 = (-b - (Math.sqrt(delta))) / (2*a);
			
			x2 = (-b + (Math.sqrt(delta))) / (2*a);
			
			System.out.println("Denklemin x1 ve x2 olarak iki tane  kökü vardýr.  " + "x1: "+ x1 +" "+  "x2:"+x2);
		}
		
		else if(delta == 0 )
		{
			double x3; 
			x3 = (-b)/ (2*a); 
			System.out.println("Denklemin iki kökü birbirne  eþittir. x1  = x2: "+ x3);
		}
		else
		{
			System.out.println("Denklemin kökü yoktur. ");
		}
		
		
		System.out.println("Diskiminant degeri: "+ delta);
		
	}

}
