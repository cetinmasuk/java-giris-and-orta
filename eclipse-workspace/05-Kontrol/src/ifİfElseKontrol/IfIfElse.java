package if�fElseKontrol;

public class IfIfElse {
	public static void main(String[] args) {
		

		 char katar1 = 'A'; 
		 
		 char katar2 = 'B'; 

		 
		 if ( katar1 != katar2) // != e�it de�ildir sorsunu sorar.
		 {
			 System.out.println("KARAKTERLER FARKLIDIR.");
		 }
		 
		 if(katar1 == katar2 )
		 {
			 System.out.println("Karakter ayn�d�r.");
		 }
		 
		 
		 else 
		 {
			 System.out.println("Karakter farkl�d�r.");
		 }
		 
		 // SADECE �F ELSE  KULLANALAM VE SORGULAMAYI KARARLI HALE GET�REL�M.
		 
		  int ortalama = 60; 
		  
		  if(ortalama >= 80)
		  {
			  System.out.println("BB Ge�tiniz. ");
		  }
		  
		  else if (ortalama > 70 )
		  {
			  System.out.println("CB �LE GE�T�N�Z.");
		  }
		  
		  else if (ortalama >=60 )
		  {
			  System.out.println("CC �LE GE�T�N�Z.");
		  }
		  else 
		  {
			  System.out.println("CD �LE KALDINIZ");
		  }
		 
		 
		 
		 
		 
		 
	}

}
