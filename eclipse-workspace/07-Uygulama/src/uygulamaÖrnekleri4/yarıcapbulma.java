package uygulama�rnekleri4;

import java.util.Scanner;

public class yar�capbulma {
	public static void main(String[] args) {
		
		Scanner tara = new Scanner(System.in);
		
		System.out.println("L�tfen yar� �ap giriniz: ");
		int  r; 
		
		r = tara.nextInt(); 
		
		double alan; 
		alan = (Math.PI) * r *r; 
		
		System.out.println("L�tfen A��n�n Derecesini Giriniz: ");
		
		double ac�; 
		
		ac� = tara.nextInt();
			
		System.out.println("Girilen Dairenin Alan�: " + alan);
		
		double cevre; 
		
		cevre = 2*r*(Math.PI);
		
		System.out.println("Dairenin �evre Uzunlu�u: "+cevre);
		
		double uzunluk;
		
		uzunluk = 2*r*(Math.PI)*ac�;
		
		System.out.println("Dairenin Uzunlu�u:"+ uzunluk);
		
		//double alan,r = 0; 
		
		//alan = (Math.PI) * 2*r*r;
		
		
		
		
		
		
		
	}

}
