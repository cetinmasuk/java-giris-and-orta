package uygulamaÖrnekleri1;

import java.util.Scanner;

public class bülünebilme {
	public static void main(String[] args) {
		
		
		
	  int sayi1 ; 
	  
	  int sayi2; 
	  
	  Scanner tara = new  Scanner(System.in);
	  
	  System.out.print("Birinci Sayýyý Giriniz: ");
	  sayi1=tara.nextInt(); 
	  System.out.print("Ýkinci Sayýyý Giriniz: ");
	  sayi2=tara.nextInt();
	  System.out.println("3 ve 4 ile bölünen sayýlar");
	  for(int i=sayi1; i<sayi2; i++)
	  {
		  if(i % 3 == 0 && i % 4 == 0 )  // 3 ve 4 bölünen sayýlar
		  {
			  System.out.println(i);
		  }
	  }
	  
	   
	  System.out.println("3 veya 4 bölünen Sayýlar");
	  for(int i=sayi1; i<sayi2; i++)
	  {
		  if(i % 3 == 0 || i%4==0)
		  {
			  System.out.print(i+" 1");
		  }
	  }
	  
		tara.close();
		
		
		
	}

}
