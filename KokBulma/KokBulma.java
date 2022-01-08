package KokBulma;

import java.util.Scanner;

public class KokBulma
{
	public static void kokIslem(int a, int b, int c)
	{
		int delta = b*b-4*(a*c);
		
		if(delta > 0 )
		{
			System.out.println("Polinomda 2 farkli kök vardir.");
			System.out.println("kokler toplami :"+(-b/a)+"\n"+"Kökler carpimi :"+(c/a));
		}
		else if(delta == 0)
		{
			System.out.println("Polinomda 1 kök vardir.");
			System.out.println("kokler toplami :"+(-b/a)+"\n"+"Kökler carpimi :"+(c/a));
		}
		else
		{
			System.out.println("Sistemde kök yoktur.");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Baş katsayilari giriniz :");
		int n = input.nextInt();
		int n1 = input.nextInt(); 
		int n2 = input.nextInt();
		kokIslem(n,n1,n2);

		input.close();
	}
}