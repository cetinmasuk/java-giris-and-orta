package tester;

import java.util.Scanner;

public class denklem {
	
	public static void main (String args[])
	{
		 int a,b,c;
		
		 Scanner tara = new Scanner(System.in); 	
		 
		 System.out.println("Lütfen aþagýya a, b ve c parametrelerini giriniz: ");
		 
		 
		 // delta = b^2 - 4ac 
		 //-b/2a
		 
		 a = tara.nextInt(); 
		 b=tara.nextInt(); 
		 c=tara.nextInt(); 
		 
		 double  delta;
		 
		 delta = (int) (Math.pow(b, 2) - (4* a*c)); 
		 
		if(delta > 0 )
		{
			double x1; 
			
			x1 = (-b - (Math.sqrt(delta))) / (2*a);
			
			double x2; 
			x2 = (-b + (Math.sqrt(delta))) / (2*a);
			System.out.println("Delta sýfýrdan büyüktür denklemin kökleri: "+ x1 + " ve "+ x2);
			
		}
		
		else if ( delta == 0 )
		{
			double x3 = -b/(2*a); 
			System.out.println("Delta 0 eþiitir  ve X1 ve X2'nin deðeri: " + x3);
		}
		else 
		{
			System.out.println("Denklemin kökü yoktur. ");
		}
			
		System.out.println("Diskiminant Deðeri: "+ delta);
		
		
	}
	

}
