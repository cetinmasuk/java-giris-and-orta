package diziGiris3;

import java.util.Scanner;

public class KullanıcınınDiziOlusturması {

	public static void main(String[] args) {
		
		Scanner tara =  new Scanner(System.in); 
		
		int sayi; 
		int toplam=0;
		System.out.println("Dizi Boyutu Belirleyiniz: " );
		
		sayi=tara.nextInt();
		
		int [] dizi = new int [sayi];
		
		for(int i=0; i<=sayi; i++)
		{
			System.out.println("Dizi Degerlerini Girniz: ");
		
			dizi [i]= tara.nextInt();
		}
		for(int i=0; i<sayi;i++)
		{
			
			toplam+=sayi; 
			
			
		}
		System.out.println("Sayıların Toplamı: "+ sayi);
		System.out.println("Sayıların ortalaması: " + (toplam/sayi));
		
	}

}
