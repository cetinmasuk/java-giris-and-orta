package iliskiselOperatorler;

public class �liskiselOpertorler {
	public static void main(String[] args) {
		
		
		/*
		 * == atama operat�r� 
		 * >  b�y�kt�r operat�r� 
		 * <  k���kt�r operat�r� 
		 * >= b�y�k e�ittir operat�r� 
		 * <= k���k e�ittir operat�r� 
		 * != mant�ksal e�it De�il 
		 */
		
		int sayi1, sayi2; 
		sayi1=23; 
		sayi2=23; 
		
		boolean durum = !(sayi1!=sayi2); // false ��kar. 
		System.out.println(durum);
		boolean kont = sayi1 > sayi2 ;   // true d�nd�r�r
		System.out.println(kont);
		boolean kont1 = sayi1 < sayi2; 
		System.out.println(kont1);
		
		boolean x = sayi1 != sayi2; 
		while (x)
		{
			System.out.println("Merhaba!");
			
		}
		System.out.println("De�i�");
	
		
		
		
		
		
		
	}

}
