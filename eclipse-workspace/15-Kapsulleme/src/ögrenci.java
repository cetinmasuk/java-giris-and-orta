
public class �grenci {
	
	private String ad; 
	private String soyisim; 
	private String �grencino; 
	private int dogumy�l�; 
	
	
	
	
	public �grenci()
	{
		
	}
	
	public �grenci(String a, String s, String �, int d)
	{
		ad = a; 
		soyisim = s; 
		�grencino = �; 
		dogumy�l�=d; 
			
	}
	
	void isimYaz(String i )
	{
		
		if(i.length()<3 )
		{
			
			ad="Kullan�c�";
			System.out.println("Varsa�lan �sim atand�:"+ad);
		}
		else {
			ad= i; 
			System.out.println(ad);		}
			
		
	}
	
	void soyisimYaz(String s)
	{
		if(s.length()<3)
		{
			soyisim = "Kullan�c�Soy"; 
			System.out.println("Kullan�c� Soyad� atand�: " + soyisim);
		}
		
		else {
			soyisim = s; 
			System.out.println(soyisim);
		}
	}
	
	
	

}
