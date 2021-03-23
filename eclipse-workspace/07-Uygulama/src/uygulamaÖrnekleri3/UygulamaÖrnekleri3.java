package uygulamaÖrnekleri3;

import java.util.Scanner;



public class UygulamaÖrnekleri3 {
	public static void main(String[] args) {
		int x; 
		int y = 0; 
		int sonuc=0; 
		Scanner tara = new Scanner(System.in);
		
		System.out.print("X Sayýsýný  Giriniz:");
		x=tara.nextInt();
		
		System.out.print("Y Sayýsýnýn Giriniz:");
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
			System.out.println("Farklý parametler giridiniz. ");
		}
		 System.out.println("Sonuc: " + sonuc);
		tara.close();
	}

}
