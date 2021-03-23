package uygulamaÖrnekleri4;

import java.util.Scanner;

public class yarýcapbulma {
	public static void main(String[] args) {
		
		Scanner tara = new Scanner(System.in);
		
		System.out.println("Lütfen yarý çap giriniz: ");
		int  r; 
		
		r = tara.nextInt(); 
		
		double alan; 
		alan = (Math.PI) * r *r; 
		
		System.out.println("Lütfen Açýnýn Derecesini Giriniz: ");
		
		double acý; 
		
		acý = tara.nextInt();
			
		System.out.println("Girilen Dairenin Alaný: " + alan);
		
		double cevre; 
		
		cevre = 2*r*(Math.PI);
		
		System.out.println("Dairenin Çevre Uzunluðu: "+cevre);
		
		double uzunluk;
		
		uzunluk = 2*r*(Math.PI)*acý;
		
		System.out.println("Dairenin Uzunluðu:"+ uzunluk);
		
		//double alan,r = 0; 
		
		//alan = (Math.PI) * 2*r*r;
		
		
		
		
		
		
		
	}

}
