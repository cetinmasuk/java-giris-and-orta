package bankaUygulamas�;

import java.util.Scanner;

public class BankaUygulamas� {
	
	static Scanner tara = new Scanner (System.in); 
	
	public static void main(String[] args) {
		String adsoyad; 
		
		adsoyad= adSoyad(); 
		men�();
		int secenek = secenekal(); 
		secenekKontrol(secenek);
		
		
	}
	public static void secenekKontrol(int secenek)
	{
		if ( secenek ==1 )
		{
			
		}
		else if ( secenek == 2 )
		{
			
		}
		else if(secenek == 3)
		{
			
		}
		else if ( secenek == 4)
		{
			
		}
		 
	}
	
	
	public static String adSoyad()
	{   System.out.println("Ho� Geldiniz ");
		System.out.println("�lerlemek icin bilgilerinizi Giriniz ");
		System.out.println("Ad�n�z: ");
		String  ad; 
		ad = tara.next(); 
		System.out.println("Soyad�n�z: ");
		String soyad; 
		soyad = tara.next(); 
		
		
		return ad +" "+ soyad ; 
		
	}
	
	public static void men�()
	{
		System.out.println("*** MEN� ***");
		System.out.println("Yapmak �stedi�iniz ��lem");
		System.out.println("1 Para �ekme Yat�rma ");
		System.out.println("2 Para �ekme ");
		System.out.println("3 Bakiye Sorgu\n4 ��k�� ");
		
	}

	public static int secenekal()
	{
		System.out.println("Secenek giriniz: ");
		int sec = tara.nextInt(); 
		return sec; 
	}
}
