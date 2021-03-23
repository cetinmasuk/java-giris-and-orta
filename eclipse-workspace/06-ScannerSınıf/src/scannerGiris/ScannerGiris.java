package scannerGiris;

import java.util.Scanner;

public class ScannerGiris {
	
	public static void main(String[] args) {
		
		
		String isim ; 
		
		Scanner tara = new Scanner (System.in);
		
		System.out.print("Ýsiminizi Giriniz: ");
		
		isim = tara.nextLine(); 
		
		System.out.println("Hoþ Geldin "+isim);
		
		
		tara.close();		
		
		
		
	}

}
