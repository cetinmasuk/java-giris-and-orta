package bankaUygulamasý;

import java.util.Scanner;

public class BankaUygulamasý {
	
	static Scanner tara = new Scanner (System.in); 
	
	public static void main(String[] args) {
		String adsoyad; 
		
		adsoyad= adSoyad(); 
		menü();
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
	{   System.out.println("Hoþ Geldiniz ");
		System.out.println("Ýlerlemek icin bilgilerinizi Giriniz ");
		System.out.println("Adýnýz: ");
		String  ad; 
		ad = tara.next(); 
		System.out.println("Soyadýnýz: ");
		String soyad; 
		soyad = tara.next(); 
		
		
		return ad +" "+ soyad ; 
		
	}
	
	public static void menü()
	{
		System.out.println("*** MENÜ ***");
		System.out.println("Yapmak Ýstediðiniz Ýþlem");
		System.out.println("1 Para Çekme Yatýrma ");
		System.out.println("2 Para Çekme ");
		System.out.println("3 Bakiye Sorgu\n4 Çýkýþ ");
		
	}

	public static int secenekal()
	{
		System.out.println("Secenek giriniz: ");
		int sec = tara.nextInt(); 
		return sec; 
	}
}
