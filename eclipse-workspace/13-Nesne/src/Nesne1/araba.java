package Nesne1;

 public class araba {
	
	

	private String Marka; 
	
	private String  Model; 
	
	private String Renk; 
	
	private int year; 
	
	araba(){				 //abstrac olu�turuk. 
		
	}
	
	 araba(String marka, String model, String renk, int year)
	 	//Parametreli  yap�c�(abstrack) olu�turduk.
	{		
		this.Marka = marka;
		this.Model = model; 
		this.Renk =  renk;
		this.year =  year; 		
		
		System.out.println(Marka + " Markas� olu�truldu.");
		System.out.println(Model + " Modeli olu�turuldu. ");
		System.out.println(Renk + "  Renkte �retildi.");
		System.out.println(year + "  Tarihli �retimdir.");
		
				
	}
// Set - get ile degi�kenlerime de�er verebilirim.

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
