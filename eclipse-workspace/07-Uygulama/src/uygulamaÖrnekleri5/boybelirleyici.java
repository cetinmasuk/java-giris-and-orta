package uygulamaÖrnekleri5;

import java.util.Scanner;

public class boybelirleyici {

	public static void main(String[] args) {
		
		Scanner tara =  new Scanner (System.in);
		
		System.out.println("Lütfen boyunuzu Giriniz: ");
		
		double boy = 0; 
				
		boy = tara.nextDouble(); 
		
		String kýyasla; 
		
		kýyasla = (boy <= 1.75) ? "KISA":"UZUN"; 
		
		System.out.println("Boy deðeriniz: " + kýyasla );
		
	
		
		
		
		
		
		
		
	}
}
