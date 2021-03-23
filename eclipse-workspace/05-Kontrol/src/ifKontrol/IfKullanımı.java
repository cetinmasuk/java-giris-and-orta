package ifKontrol;

public class IfKullanýmý {
	public static void main(String[] args) {
		int sayi1 = 24;
		int sayi2 = 13;		
		
		
		if (sayi1>sayi2)
		{
			System.out.println("Büyük olan sayý: " + sayi1);
			if (sayi1>13)
			{
				System.out.println("Girilen sayý 13'den büyüktür.");
			}
		}
		
		if ( sayi1 != sayi2)
		{
			System.out.println("Sayillar birbirine eþit deðildir.");
		}
		
		if(sayi1<sayi2)

		{
			System.out.println("Büyük olan sayi: " + sayi2);
		}
		
		
		
	}

}
