package ifKontrol;

public class IfKullan�m� {
	public static void main(String[] args) {
		int sayi1 = 24;
		int sayi2 = 13;		
		
		
		if (sayi1>sayi2)
		{
			System.out.println("B�y�k olan say�: " + sayi1);
			if (sayi1>13)
			{
				System.out.println("Girilen say� 13'den b�y�kt�r.");
			}
		}
		
		if ( sayi1 != sayi2)
		{
			System.out.println("Sayillar birbirine e�it de�ildir.");
		}
		
		if(sayi1<sayi2)

		{
			System.out.println("B�y�k olan sayi: " + sayi2);
		}
		
		
		
	}

}
