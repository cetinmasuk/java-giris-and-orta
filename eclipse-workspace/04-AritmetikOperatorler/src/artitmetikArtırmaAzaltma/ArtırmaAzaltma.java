package artitmetikArt�rmaAzaltma;

public class Art�rmaAzaltma {
public static void main(String[] args) {
	
	int sayi1, sayi2, sayi3,toplam; 
	
	sayi1 = 10; 
	sayi2 = 13; 
	sayi3  = 14;
	
	toplam = sayi1++ + sayi2++ + sayi3++; 
	// virg�l bitmiyene kadar say� art�r�m� yapmaz. 
	
	
	toplam =  ++sayi1 +  ++sayi3;  // virg�lden �nce say� art�r�m� yapar. 
	
	
	toplam = +2+sayi1;  // virg�lden  �nce sayiy2 art�rd�r. 
	
	
	System.out.println(toplam);
	
	
	

}
}
