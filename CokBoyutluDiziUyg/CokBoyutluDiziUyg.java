package CokBoyutluDiziUyg;
/*
								1	2	3		
	3	6	9	12				4	5	6
	2	5	8	11				7	8	9
	1	4	7	10				10	11	12
*/ 
public class CokBoyutluDiziUyg{
	public static void main(String[] args){
		
		int[][]dizi=new int[][]{ {1,2,3},
								 {4,5,6},
								 {7,8,9},
								 {10,11,12} };
		
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				System.out.printf("%4d",dizi[i][j]);
			}
			System.out.println("");
		}

		System.out.println("");
		
		for(int k=2;k>=0;k--){
			for(int l=0;l<4;l++){
				System.out.printf("%4d",dizi[l][k]);
			}
			System.out.println("");
		}
	}
}