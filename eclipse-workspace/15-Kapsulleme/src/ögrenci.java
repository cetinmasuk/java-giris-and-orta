
public class ögrenci {
	
	private String ad; 
	private String soyisim; 
	private String ögrencino; 
	private int dogumyýlý; 
	
	
	
	
	public ögrenci()
	{
		
	}
	
	public ögrenci(String a, String s, String ö, int d)
	{
		ad = a; 
		soyisim = s; 
		ögrencino = ö; 
		dogumyýlý=d; 
			
	}
	
	void isimYaz(String i )
	{
		
		if(i.length()<3 )
		{
			
			ad="Kullanýcý";
			System.out.println("Varsaýlan Ýsim atandý:"+ad);
		}
		else {
			ad= i; 
			System.out.println(ad);		}
			
		
	}
	
	void soyisimYaz(String s)
	{
		if(s.length()<3)
		{
			soyisim = "KullanýcýSoy"; 
			System.out.println("Kullanýcý Soyadý atandý: " + soyisim);
		}
		
		else {
			soyisim = s; 
			System.out.println(soyisim);
		}
	}
	
	
	

}
