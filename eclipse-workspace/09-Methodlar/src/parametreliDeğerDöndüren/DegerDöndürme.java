package parametreliDeğerDöndüren;

public class DegerDöndürme {
	
	
	public static void main (String[] args) {
		
		int x; 
		x = sayi(6,5); 
		
		System.out.println(x);
	}
    
	
	public static int sayi(int a, int b) //methot ismi kullanılır. 
	{
		int topla = a+b; 
		
		return topla;  					//topla degerine direk olarak erişilmez.
		
		
		
	}
}
