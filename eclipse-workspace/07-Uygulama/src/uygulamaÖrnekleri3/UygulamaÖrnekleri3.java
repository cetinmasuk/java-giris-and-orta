package uygulama�rnekleri3;

import java.util.Scanner;



public class Uygulama�rnekleri3 {
	public static void main(String[] args) {
		int x; 
		int y = 0; 
		int sonuc=0; 
		Scanner tara = new Scanner(System.in);
		
		System.out.print("X Say�s�n�  Giriniz:");
		x=tara.nextInt();
		
		System.out.print("Y Say�s�n�n Giriniz:");
		y=tara.nextInt();
		if(x>0 && y>0)
		{
			sonuc = (x*x)+(y*y)+(2*x*y)+5;
		}
		else if (x<0 && y>0)
		{
			sonuc = (2*x*y)+150;
		}
		else if (x>0 && y<0)
		{
			sonuc = (2*x) + (5*y) + 10; 
		}
		else 
		{
			System.out.println("Farkl� parametler giridiniz. ");
		}
		 System.out.println("Sonuc: " + sonuc);
		tara.close();
	}

}
