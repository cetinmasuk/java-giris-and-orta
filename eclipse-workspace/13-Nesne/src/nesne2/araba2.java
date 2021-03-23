package nesne2;

public class araba2 {
	
	
	static void hareket () {
		System.out.println("Araba Hareket Ediyor.");
	}
	
	public static void main(String[] args) {
		
		arabaclass model1 = new arabaclass();  
		
		model1.Ad="C180"; 
		model1.Marka="Mercedes"; 
		model1.Yil=2020; 
		
		
		System.out.println(  model1.Marka+ " > " + model1.Ad+ "-" + + model1.Yil);
		
		hareket();
		
		
		
		
		
		
		
	}
	
	
	

}
