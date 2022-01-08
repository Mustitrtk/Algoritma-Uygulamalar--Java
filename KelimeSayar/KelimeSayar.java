package KelimeSayar;

import java.util.Scanner;

public class KelimeSayar {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Cumle giriniz : ");
        String cumle = input.nextLine();
		
		cumle = cumle.trim(); // başta ve sonda bulunan boşlukları siler
		
        int kelime=0;
		
        for (int i = 0; i < cumle.length(); i++) {
			
            if (cumle.charAt(i)==' ') {
				
                kelime++;
				
            }
        }
        
        System.out.println("Cumleniz "+(kelime+1)+" kelimeden olusuyor");

        input.close();
        
    }
    
}
