package BaklavaDilimi;
import java.util.Scanner;
public class BaklavaDilimi{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dilimin uzunlugunu giriniz :");
		int n=input.nextInt();
		
		for(int i=0;i<n;i++){

			for(int j=n;j>i;j--){
				System.out.print(" ");
			}

			for(int x=0;x<(2*i)+1;x++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int k=n-1;k>0;k--){

			for(int l=n;l>=k;l--){
				System.out.print(" ");
			}
			
			for(int m=0;m<=(2*k)-2;m++){
				System.out.print("*");
			}
			System.out.println("");
		}

		input.close();
	}
}