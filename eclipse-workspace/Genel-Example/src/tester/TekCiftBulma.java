package tester;

import java.util.Scanner;

public class TekCiftBulma {

	public static void main(String[] args) {
		
		
		
		
		int x,y; 
		Scanner tara = new Scanner(System.in);
		
		System.out.println("�ki tane  say� giriniz: ");
		x=tara.nextInt(); 
		
		y=tara.nextInt(); 
		
		
		int a,b; 
		a = Math.max(x, y); 
		b= Math.min(x, y); 
		
		
		
			if(b % 2==0 )
			{
				System.out.println("�ift say�lar: "+ b );				
				
			}
			
	
				
			
		
		
	
			if(b % 2==1 )
			{
				System.out.println("Tek say�lar: "+ b );				
				
			}
			
	
				
			b++; 
		
	

	}
}

