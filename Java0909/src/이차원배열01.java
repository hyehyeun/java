import java.util.Scanner;

public class 이차원배열01 {

	public static void main(String[] args) {
				
//		array[0][0]=sc.nextInt();
//		array[0][1]=sc.nextInt();
//		array[0][2]=sc.nextInt();
//		array[0][3]=sc.nextInt();
//	
//		array[1][0]=sc.nextInt();
//		array[1][1]=sc.nextInt();
//		array[1][1]=sc.nextInt();
//		array[1][3]=sc.nextInt();

		
		//이중반복문으로 array의 값을 넣어주세요
		//1 ~ 16까지의 값을 넣어주세요
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[4][4];
		int data = 1;
		
		//행을 의미하는 반복문
		for(int i = 0; i<array.length; i++) {
			//열을 의미하는 반복문
			for(int j = 0; j<array[0].length; j++) {
				array[i][j]=data;
				data++;
			}
			}
		for(int i = 0; i<array.length; i++) {
			//열을 의미하는 반복문
			for(int j = 0; j<array[0].length; j++) {
				System.out.println(array[i][j]);
			}
			}
		
		
		
		

	}

}
