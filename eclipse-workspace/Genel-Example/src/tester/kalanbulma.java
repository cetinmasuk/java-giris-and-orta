package tester;

import java.util.Scanner;

public class kalanbulma {

	public static void main(String[] args) {
		
		 Scanner reader = new Scanner(System.in);
	        System.out.print("Birinci Say�y� Girin: ");         
	        int sayi = reader.nextInt();
	        System.out.print("�kinci Say�y� Girin: ");   
	        int bolen = reader.nextInt();
	 
	        int bolum = sayi / bolen;
	        int kalan = sayi % bolen;
	 
	        System.out.println("��lem:"+sayi+"/"+bolen);
	        System.out.println("B�l�m = " + bolum);
	        System.out.println("Kalan: " + kalan );
	        
	        
	       
	}

}
