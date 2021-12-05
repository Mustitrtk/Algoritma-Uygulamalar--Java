package sayipiramidi;

import java.util.Scanner;

public class SayiPiramidi {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Bir sayi girniz: ");
        n=scan.nextInt();
        
        for (int i = n; i >= 1; i--) {
            
            for (int j = i; j >1; j--) {
                System.out.print(j+" ");
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }
            
            System.out.println("");
            
        }
    }
    
}
