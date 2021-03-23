package Nesne1;

 public class araba {
	
	

	private String Marka; 
	
	private String  Model; 
	
	private String Renk; 
	
	private int year; 
	
	araba(){				 //abstrac oluþturuk. 
		
	}
	
	 araba(String marka, String model, String renk, int year)
	 	//Parametreli  yapýcý(abstrack) oluþturduk.
	{		
		this.Marka = marka;
		this.Model = model; 
		this.Renk =  renk;
		this.year =  year; 		
		
		System.out.println(Marka + " Markasý oluþtruldu.");
		System.out.println(Model + " Modeli oluþturuldu. ");
		System.out.println(Renk + "  Renkte üretildi.");
		System.out.println(year + "  Tarihli üretimdir.");
		
				
	}
// Set - get ile degiþkenlerime deðer verebilirim.

	public String getMarka() {
		return Marka;
	}

	public void setMarka(String marka) {
		Marka = marka;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getRenk() {
		return Renk;
	}

	public void setRenk(String renk) {
		Renk = renk;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	 
	
	

}
