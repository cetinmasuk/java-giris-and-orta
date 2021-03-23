package uygulamaÖrnekleri;

import java.util.Scanner;

public class vizefinal {
	public static void main(String[] args) {
		
		double vize; 
		double finall; 
		double ortalama; 
		
		Scanner tara = new Scanner(System.in);
		
		System.out.print("Vize Notunuzu Giriniz: ");
		vize = tara.nextDouble(); 
		System.out.print("Final Notunuz Giriniz: ");
		finall = tara.nextDouble(); 
		
		ortalama = vize*0.4+finall*0.6; 
		System.out.println("Ortalamanýz: "+ortalama);
		
		if (ortalama>=90 && ortalama<=100)
		{
			System.out.println("Harf Notunuz AA");
		}
		else if (ortalama >=70 &&  ortalama<=89 )
		{
			System.out.println("Harf Notunuz BB");
		}
		else if (ortalama>=50 &&  ortalama<=69)
		{
			System.out.println("Harf Notunuz CC");
		}
		else 
		{
			System.out.println("Sýnýfta Kaldýnýz!");
		}
		
		tara.close();
		
		
		
		
		
	}

}
