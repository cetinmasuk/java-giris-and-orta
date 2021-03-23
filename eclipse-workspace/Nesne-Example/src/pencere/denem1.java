package pencere;

public class denem1 {
	
	static void degistir (int x)
	{
		x= x+10;
	}
	
	
	public static void main(String[] args) {
		
		
		int a = 5; 
		
		System.out.println("Eski deger: " +a );
		
		
		degistir(a);
		
		System.out.println("Yeni deger: " + a);
		
		
	}

}
