package uygulama�rnekleri5;

import java.util.Scanner;

public class boybelirleyici {

	public static void main(String[] args) {
		
		Scanner tara =  new Scanner (System.in);
		
		System.out.println("L�tfen boyunuzu Giriniz: ");
		
		double boy = 0; 
				
		boy = tara.nextDouble(); 
		
		String k�yasla; 
		
		k�yasla = (boy <= 1.75) ? "KISA":"UZUN"; 
		
		System.out.println("Boy de�eriniz: " + k�yasla );
		
	
		
		
		
		
		
		
		
	}
}
