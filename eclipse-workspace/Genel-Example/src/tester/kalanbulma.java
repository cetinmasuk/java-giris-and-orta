package tester;

import java.util.Scanner;

public class kalanbulma {

	public static void main(String[] args) {
		
		 Scanner reader = new Scanner(System.in);
	        System.out.print("Birinci Sayýyý Girin: ");         
	        int sayi = reader.nextInt();
	        System.out.print("Ýkinci Sayýyý Girin: ");   
	        int bolen = reader.nextInt();
	 
	        int bolum = sayi / bolen;
	        int kalan = sayi % bolen;
	 
	        System.out.println("Ýþlem:"+sayi+"/"+bolen);
	        System.out.println("Bölüm = " + bolum);
	        System.out.println("Kalan: " + kalan );
	        
	        
	       
	}

}
