package diziGiris2;

import java.util.Scanner;

public class Kullan�c�DegerAlarakDiziCag�rmas� {
	
	public static void main(String[] args) {
		
		
						//   0 			1		2		3			4		5			6
	String [] gunler = {"Pazartesi","Sal�","�arsamba","Persembe","Cuma","Cumartesi","Pazar"};
	//String'de de�erler �ift t�rnak aras�na yaz�l�r. 
	
	
		
		System.out.println("Haftan�n G�nleri: " + gunler.length);
		
	
		//Dizi �zerinde de�i�iklik yapabilirim. index de�eri sali olan diziye mayis ekliyorum. 
		 gunler [2] = "May�s"; 
		 System.out.println("Yeni indis de�eri: "+ gunler[2]);
	 
		//G�nleri saya� olarak ekrana yazd�rma.
		 
		for (int i=0; i<7;i++)
		{
			System.out.println(gunler[i]);
		}
		
		//Kullan�c�dan de�er alarak indeks �ag�rma. 
		
		int a; 
		Scanner tara = new Scanner(System.in); 
		System.out.println("Haftan�n g�n� giriniz: ");
		a=tara.nextInt(); 
		
		System.out.println(gunler[a-1]);
		
	}

}
