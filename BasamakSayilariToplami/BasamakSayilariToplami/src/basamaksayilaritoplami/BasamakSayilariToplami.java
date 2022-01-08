package BasamakSayilariToplami.BasamakSayilariToplami.src.basamaksayilaritoplami;
import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a random number :");
        int number = input.nextInt();
        int digit = 0;//Basamak sayisini tutan değisken
        
        int total = 0;//Basamak sayilarinin toplamini tutan değisken
        
        while(number>0)
        {
            digit = number %10;
            total = total+digit;
            number = number/10;
        }
        
        System.out.println("sum of digits : "+total);
        input.close();
    }
    
}
