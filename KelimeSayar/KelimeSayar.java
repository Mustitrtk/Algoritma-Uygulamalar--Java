import java.util.Scanner;

public class KelimeSayar {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Cumle giriniz : ");
        String cumle = input.nextLine();
		
		cumle = cumle.trim(); // başta ve sonda bulunan boşlukları siler
		
        char[] ch = new char[cumle.length()];
		
        int kelime=0;
		
        for (int i = 0; i < cumle.length(); i++) {
			
            ch[i]= cumle.charAt(i);
			
            if (ch[i]==' ') {
				
                kelime++;
				
            }
        }
        
        System.out.println("Cumleniz "+(kelime+1)+" kelimeden olusuyor");

        input.close();
        
    }
    
}
