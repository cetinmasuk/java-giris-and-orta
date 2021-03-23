package Nesne1;

public class araba1 {
	
	public static void main(String[] args) {
		
		araba  model2 = new araba("Mercedes","C185","Mavi", 2015); 
		
		
		System.out.println("------------------------------------");
		
		araba model3 =  new araba("Fiat", "B150", "Kırmızı", 2012);	
		
		
		araba model4 = new araba (); 
		
		model4.setMarka("Fiat");
		
		System.out.println("Marka: " + model4.getMarka());
		
		
		
	}

}
