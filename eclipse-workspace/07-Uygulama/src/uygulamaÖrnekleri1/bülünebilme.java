package uygulama�rnekleri1;

import java.util.Scanner;

public class b�l�nebilme {
	public static void main(String[] args) {
		
		
		
	  int sayi1 ; 
	  
	  int sayi2; 
	  
	  Scanner tara = new  Scanner(System.in);
	  
	  System.out.print("Birinci Say�y� Giriniz: ");
	  sayi1=tara.nextInt(); 
	  System.out.print("�kinci Say�y� Giriniz: ");
	  sayi2=tara.nextInt();
	  System.out.println("3 ve 4 ile b�l�nen say�lar");
	  for(int i=sayi1; i<sayi2; i++)
	  {
		  if(i % 3 == 0 && i % 4 == 0 )  // 3 ve 4 b�l�nen say�lar
		  {
			  System.out.println(i);
		  }
	  }
	  
	   
	  System.out.println("3 veya 4 b�l�nen Say�lar");
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
