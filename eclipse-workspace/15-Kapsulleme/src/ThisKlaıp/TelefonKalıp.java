package ThisKla?p;

public class TelefonKal?p {
	private String Marka; 
	private String  Model; 
	private String  Renk; 
	private int year; 
			
	
	
			public TelefonKal?p(String Marka, String Model, String Renk, int year ) {
				
				this.Marka = Marka; 
				this.Model = Model; 
				this.Renk  = Renk; 
				this.year = year; 				
				
				
				System.out.println( Marka + " Telefon Markasi");
				System.out.println(Model + "-" +   Marka + " Markas?n?n ?r?n?d?r.");
				System.out.println(Renk + 	" Telefonun Rengi.");
				System.out.println(year	+ 	" ?retilmi?tir.");
				
				
			}



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


			public String toString() {
				
				return     "Marka" + Marka + "Model: " + Model + " Renk " + Renk + "?retim yil " + year ; 
				
			}
				
	
	
			
	
	

}
