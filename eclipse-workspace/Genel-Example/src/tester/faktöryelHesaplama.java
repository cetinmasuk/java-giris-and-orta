package tester;

import java.util.Scanner;

public class fakt�ryelHesaplama {

	public static void main(String[] args) {
		
		int sayi; 
		Scanner tara = new Scanner(System.in); 
		System.out.println("Sayi giriniz: ");
		sayi = tara.nextInt();
		
		
		int fakt�ryel = 1 ;
		
		for(int i=2; i<=sayi; i++)
		{
			fakt�ryel=i*fakt�ryel; 
			System.out.println(i+"*" +  fakt�ryel);
			
			
		}
		
		
		System.out.println("Bitti.");
		
	

	}

}
