package TekrarliIslem;

import java.util.Scanner;
public class Loop_Boolean
{
	public static int total(int a)
	{
		return a*(a+1)/2;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean control= true; //our variables for loop*
		int n = 1;
		while(control != false)
		{
			
		    System.out.print("Enter a random number between 1 and 100: ");
		    n = input.nextInt();
			if(n>=1 && n<=100) 
			{
				control = false;
			}
			
			else{
				System.out.println("Warning!! this numbir is not in the value range.");
				control = true;
			}
		}
		
		
		System.out.println("sum of number from 1 to "+n+" : "+total(n));
		
		input.close();
	}
}