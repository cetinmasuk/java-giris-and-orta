package tester;

import java.util.Scanner;

public class mesafeHesaplama {
	
	
	public static double hesapla (double h1, String y1, double h2, String y2, double t)
	{
		double sonuc;
		if(y1.equals(y2)) {
			if(h1>h2) {
				sonuc = (h1-h2)*(t/60);
			}
			else {
				sonuc =(h2-h1)*(t/60); 
			}
			
			
		}
		else {
			sonuc=(h1+h2)*(t/60); 
		}		
		return sonuc; 
	}

	public static void main(String[] args) {
		
		Scanner tara = new Scanner(System.in); 
		
		System.out.println("1: Aracýn Hýzýný Giriniz: ");
		
		double h1=tara.nextDouble(); 
		
		System.out.println("1: Aracýn Yönünü Giriniz: ");
		
		String y1=tara.next(); 
		
		System.out.println("2: Aracýn Hýzýný Giriniz: ");
		
		double h2=tara.nextDouble(); 
		
		System.out.println("2: Aracýn Yönünü Giriniz: ");
		
		String y2=tara.next(); 
		
		System.out.println("Süreyi giriniz: ");
		
		double t = tara.nextDouble(); 
		
		double sonuc = hesapla(h1, y1, h2, y2, t);
		
		System.out.println("Sonu: "+ sonuc );
		
		
		
		
		
		

	}

}
