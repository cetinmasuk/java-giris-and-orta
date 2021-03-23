package tester;

import java.util.Scanner;

public class ucsayi {

	public static void main(String[] args) {
		
		 
		Scanner tara = new Scanner(System.in); 
		
		int a,b,c,d; 
		
		System.out.println("3 Tane sayý giriniz: ");
		a=tara.nextInt(); 
		b=tara.nextInt(); 
		c=tara.nextInt(); 
		
		d = Math.max(a, b);
		
		int e; 
		
		e= Math.max(d, c); 
		System.out.println(e);
		
		
		
	}
	
	
	
}
