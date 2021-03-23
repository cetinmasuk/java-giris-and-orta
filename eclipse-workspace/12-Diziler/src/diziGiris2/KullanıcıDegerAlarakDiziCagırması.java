package diziGiris2;

import java.util.Scanner;

public class KullanýcýDegerAlarakDiziCagýrmasý {
	
	public static void main(String[] args) {
		
		
						//   0 			1		2		3			4		5			6
	String [] gunler = {"Pazartesi","Salý","Çarsamba","Persembe","Cuma","Cumartesi","Pazar"};
	//String'de deðerler çift týrnak arasýna yazýlýr. 
	
	
		
		System.out.println("Haftanýn Günleri: " + gunler.length);
		
	
		//Dizi üzerinde deðiþiklik yapabilirim. index deðeri sali olan diziye mayis ekliyorum. 
		 gunler [2] = "Mayýs"; 
		 System.out.println("Yeni indis deðeri: "+ gunler[2]);
	 
		//Günleri sayaç olarak ekrana yazdýrma.
		 
		for (int i=0; i<7;i++)
		{
			System.out.println(gunler[i]);
		}
		
		//Kullanýcýdan deðer alarak indeks çagýrma. 
		
		int a; 
		Scanner tara = new Scanner(System.in); 
		System.out.println("Haftanýn günü giriniz: ");
		a=tara.nextInt(); 
		
		System.out.println(gunler[a-1]);
		
	}

}
