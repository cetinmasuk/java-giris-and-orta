package tester;

import java.util.Scanner;

public class girilensayicift {
	
	
	public static void main(String[]args)
	{
		
		int s1,s2; 
		
		Scanner tara= new Scanner(System.in);
		
		
		
		System.out.println("Ýki tane sayý giriniz: ");
		
		s1=tara.nextInt();
		s2=tara.nextInt(); 
		
		
		//int x; 
		//x = Math.max(s1, s2);
		
		 for(int i= Math.min(s1, s2); i<=Math.max(s1, s2); i++)
		 {
			 if(Math.max(s1, s2) % 2 == 0 )
			 {
				 System.out.println(i);
			 }
			 else 
			 {
				 System.out.println(i);
			 }
			 i++;
			 
		 }
		
		
		
		
		
	}
	

}
