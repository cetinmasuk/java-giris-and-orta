package parametresizDegerDöndüren;

import java.util.Scanner;



public class degerdöndüren {
	 
		static Scanner tara = new Scanner( System.in);
	
	public static void main(String[] args ) {
		
	 int x = fark(); 
		  System.out.println(x);
	
	
		
	}
	 public static int fark()
	 {
		 int a = 7, b = 4, sonuc; 
		 sonuc = a-b; 
		 return sonuc; 
	 }
	
	 
	
	/*
	 public static String adSoyadAl()
	 
	 {
		 String ad; 
		 String soyad; 
		 System.out.println("Hoþgeldiz, Lütfen ilerlemek için ");
		 
		 System.out.println("Adýnýzý Giriniz: ");
		 
		 ad = tara.next(); 
		 System.out.println("Soyadýnýz Giriniz");
		 soyad  = tara.next(); 
		 
		 return ad + ""+ soyad; 
	 }
	*/
 	
}
