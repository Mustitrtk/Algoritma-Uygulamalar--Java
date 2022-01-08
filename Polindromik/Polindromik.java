package Polindromik;
import java.util.Scanner;
public class Polindromik{
	public static void polindromikkontrol(String a){

		String kontrol = "";

		for(int i=a.length()-1;i>=0;i--){

			kontrol =kontrol+a.charAt(i);
		}
		
		if(kontrol.equals(a)){
			System.out.println("Kelime polindromiktir.");
		}
		else{
			System.out.println("Kelime polindromik degildir.");
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Polindromik oldugunu kontrol etmek istediginiz kelimeyi giriniz :");
		String kelime = input.next();

		kelime=kelime.toLowerCase();

		polindromikkontrol(kelime.trim());

		input.close();
	}
}