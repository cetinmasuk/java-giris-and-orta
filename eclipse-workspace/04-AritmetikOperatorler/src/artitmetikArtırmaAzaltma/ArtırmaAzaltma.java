package artitmetikArtýrmaAzaltma;

public class ArtýrmaAzaltma {
public static void main(String[] args) {
	
	int sayi1, sayi2, sayi3,toplam; 
	
	sayi1 = 10; 
	sayi2 = 13; 
	sayi3  = 14;
	
	toplam = sayi1++ + sayi2++ + sayi3++; 
	// virgül bitmiyene kadar sayý artýrýmý yapmaz. 
	
	
	toplam =  ++sayi1 +  ++sayi3;  // virgülden önce sayý artýrýmý yapar. 
	
	
	toplam = +2+sayi1;  // virgülden  önce sayiy2 artýrdýr. 
	
	
	System.out.println(toplam);
	
	
	

}
}
