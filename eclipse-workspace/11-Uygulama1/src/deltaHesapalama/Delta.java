package deltaHesapalama;

import java.util.Scanner;

public class Delta {
	public static double deltaHesapla(int a, int b, int c)
	{
		 double delta = Math.pow(b, 2)- 4*a*c;
		
		return delta; 
	}
	
	 public static void deltaKontrol(double delta)
	 {
		 if (delta >0 )
			 System.out.println("Farklý Ýki reel kök vardýr.");
		 else if ( delta == 0)
		 {
			 System.out.println("Çakýþýk iki kök vardýr");
		 }
		 
		 else if (delta<0)
		 {
			 System.out.println("Gerçel kökler yoktur");
		 }
		 
		 
		 
	 }
	
	
	public static void main(String[] args) {
		
		int a; 
		int b; 
		int c; 
		Scanner tara = new Scanner(System.in);
		System.out.println("B degerini Giriniz: ");
		b = tara.nextInt(); 
		System.out.println("A degerini Giriniz: ");
		a= tara.nextInt(); 
		System.out.println("C degerini Giriniz: ");
		c=tara.nextInt(); 
		
		double delta  = deltaHesapla(a, b, c); 
		deltaKontrol(delta);
		
		
		
		
		
		
		
				
		
		
		
	}

}
