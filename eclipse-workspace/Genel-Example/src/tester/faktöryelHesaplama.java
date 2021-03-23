package tester;

import java.util.Scanner;

public class faktöryelHesaplama {

	public static void main(String[] args) {
		
		int sayi; 
		Scanner tara = new Scanner(System.in); 
		System.out.println("Sayi giriniz: ");
		sayi = tara.nextInt();
		
		
		int faktöryel = 1 ;
		
		for(int i=2; i<=sayi; i++)
		{
			faktöryel=i*faktöryel; 
			System.out.println(i+"*" +  faktöryel);
			
			
		}
		
		
		System.out.println("Bitti.");
		
	

	}

}
