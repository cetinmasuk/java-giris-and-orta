package mathÖrnek;

import java.util.Scanner;

public class MathÖrnek1 {
public static void main(String[] args) {
		
		int x=0;
		int y = 0;
		int sonuc=0; 
		
		
		Scanner tara = new Scanner(System.in);
		
		System.out.println("Sayý Giriniz:" );
		x=tara.nextInt();
		System.out.println("Sayi Giriniz: ");
		y=tara.nextInt();
		 sonuc = (int)Math.pow(x, (int)Math.pow(y,(int)Math.pow(x,2)));
		
		
		System.out.println(sonuc);
		
		tara.close();
}
		
}
