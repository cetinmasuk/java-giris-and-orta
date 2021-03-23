package ifÝfElseKontrol;

public class IfIfElse {
	public static void main(String[] args) {
		

		 char katar1 = 'A'; 
		 
		 char katar2 = 'B'; 

		 
		 if ( katar1 != katar2) // != eþit deðildir sorsunu sorar.
		 {
			 System.out.println("KARAKTERLER FARKLIDIR.");
		 }
		 
		 if(katar1 == katar2 )
		 {
			 System.out.println("Karakter aynýdýr.");
		 }
		 
		 
		 else 
		 {
			 System.out.println("Karakter farklýdýr.");
		 }
		 
		 // SADECE ÝF ELSE  KULLANALAM VE SORGULAMAYI KARARLI HALE GETÝRELÝM.
		 
		  int ortalama = 60; 
		  
		  if(ortalama >= 80)
		  {
			  System.out.println("BB Geçtiniz. ");
		  }
		  
		  else if (ortalama > 70 )
		  {
			  System.out.println("CB ÝLE GEÇTÝNÝZ.");
		  }
		  
		  else if (ortalama >=60 )
		  {
			  System.out.println("CC ÝLE GEÇTÝNÝZ.");
		  }
		  else 
		  {
			  System.out.println("CD ÝLE KALDINIZ");
		  }
		 
		 
		 
		 
		 
		 
	}

}
