import java.util.Scanner;

public class TersYazdirma{

	public static void Ters(String s)
	{

		for(int i = s.length()-1 ; i >= 0 ; i--){
			System.out.print(s.charAt(i));
		}

	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir kelime giriniz: ");
		String kelime = input.next();
		Ters(kelime);
		input.close();
	}
}