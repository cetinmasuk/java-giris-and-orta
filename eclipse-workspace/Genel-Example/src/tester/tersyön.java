package tester;

import java.util.Scanner;

public class tersy�n {
	
	public static int hesapla(int h1,int h2, int t)
	{
		
		if(h1>h2)
		{
			return  (h1-h2)*t; 
		}
		
		else 
		{
			return (h2-h1)*t; 
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner tara = new Scanner(System.in);
		
		int arac1,arac2,t; 
		
		System.out.println("Birinci aracin h�z�n� giriniz: ");
		arac1 = tara.nextInt(); 
		
		System.out.println("�kinci aracin hizini  giriniz: ");
		arac2=tara.nextInt(); 
		
		System.out.println("S�re giriniz: ");
		t=tara.nextInt();
		
		int y = hesapla(arac1,arac2,t);
		System.out.println("Fark: "+ y);
		
		
		
		
		
	}

}
