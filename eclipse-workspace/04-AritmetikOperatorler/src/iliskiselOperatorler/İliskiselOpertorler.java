package iliskiselOperatorler;

public class ÝliskiselOpertorler {
	public static void main(String[] args) {
		
		
		/*
		 * == atama operatörü 
		 * >  büyüktür operatörü 
		 * <  küçüktür operatörü 
		 * >= büyük eþittir operatörü 
		 * <= küçük eþittir operatörü 
		 * != mantýksal eþit Deðil 
		 */
		
		int sayi1, sayi2; 
		sayi1=23; 
		sayi2=23; 
		
		boolean durum = !(sayi1!=sayi2); // false çýkar. 
		System.out.println(durum);
		boolean kont = sayi1 > sayi2 ;   // true döndürür
		System.out.println(kont);
		boolean kont1 = sayi1 < sayi2; 
		System.out.println(kont1);
		
		boolean x = sayi1 != sayi2; 
		while (x)
		{
			System.out.println("Merhaba!");
			
		}
		System.out.println("Deðiþ");
	
		
		
		
		
		
		
	}

}
