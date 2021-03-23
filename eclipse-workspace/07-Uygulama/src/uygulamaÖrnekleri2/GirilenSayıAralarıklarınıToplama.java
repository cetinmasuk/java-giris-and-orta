package uygulamaÖrnekleri2;

import java.util.Scanner;

public class GirilenSayıAralarıklarınıToplama {
	public static void main(String[] args) {
		 
		int sayi1; 
		int sayi2; 
		int  sonuc=0; 
		Scanner tara = new Scanner (System.in); 
		sayi1= tara.nextInt();
		sayi2 = tara.nextInt();
		
		while (sayi1 <=sayi2)
		{
			sonuc= sayi1+sonuc; 
			sayi1++; 
			
		}
		System.out.println(sonuc);
		
		tara.close();
		
		
		
	}

}
