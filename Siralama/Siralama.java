package Siralama;
import java.util.Scanner;
public class Siralama{

	public static void desc(int[] dizi){
		int temp=0;
		for(int k=0;k<7;k++){
			for(int l=k+1;l<7;l++){ // 0 2
				if(dizi[k]<dizi[l]){
					temp=dizi[k]; // 0
					dizi[k]=dizi[l]; // 2 2
					dizi[l]=temp; // 2 0
				}
			}
		}
		
		System.out.println("Buyukten kucuge sirali hali");
		
		for(int item:dizi){
			System.out.printf("%4d",item);
		}
		
	}

	public static void asc(int[] dizi){
		int temp=0;
		for(int k=0;k<7;k++){
			for(int l=k+1;l<7;l++){
				if(dizi[k]>dizi[l]){ // 7 6
					temp=dizi[k]; // 7
					dizi[k]=dizi[l]; // 6 6
					dizi[l]=temp; // 6 7
				}
			}
		}

		System.out.println("Kucukten buyuge sirali hali");

		for(int item:dizi){
			System.out.printf("%4d",item);
		}
	}

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int[] dizi = new int[7];
		
		for(int i=0;i<7;i++){
			System.out.print("Dizinin "+(i+1)+". elemanını giriniz :");
			dizi[i]= input.nextInt();
		}

		desc(dizi);
		System.out.println("");
		asc(dizi);
		
		input.close();
	}
}