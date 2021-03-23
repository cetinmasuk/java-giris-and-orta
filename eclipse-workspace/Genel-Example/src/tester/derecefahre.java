package tester;

import java.util.Scanner;
import java.util.*;
public class derecefahre {
	
	 public  static double hesapla (double a )
	 {
		 double fah; 
		 
		 return fah= (( a * 9)/5) + 32 ; 
		 
		 
	 }
	
	
	
	public static void main(String[] args) {
		
		
		//°F = °C x 9/5 + 32
		
		 double derece; 
		 
		 System.out.println("Dereceyi Giriniz: ");
		 Scanner tara = new Scanner(System.in); 
		  derece = tara.nextDouble(); 
		 double fah; 
		 
		 
		 System.out.println( hesapla(derece));
		
		
	}

}
