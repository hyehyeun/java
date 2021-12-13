import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		
		//크기가 5인 정수형 배열 array를 만들고
		//사용자가 입력한 값으로 초기화 시켜주세요!
		
		int[] array = new int[5]; 
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<array.length; i++) {
			System.out.println((i+1)+ "번째 값");
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		
		
		
		
		
		
		
//		//버블정렬
//		for(int i=0;i<array.length;i++ ) {
//			//step 안에서 비교가 되는 반복문
//			for(int j=0; j<array.length-(i+1);j++) { 
//				if(array[j]>array[j+1]) {
//					int temp = array[j+1];
//					array[j+1] = array[j];
//					array[j] = temp;
//				}
//			}
//		}
		
		
		
		
		
		//배열 출력
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+" ");
			
		}
//		이중 for문
//		치환 -> 변수의 값을 바꾸기
//		for(int i = 0; i < array.length; i++) {			
//			int num1=10;
//			int num2=20;
//			int temp;			
//			temp = num1;
//			num1 = num2;
//			num2 = temp;
//		
//		
//		
//			System.out.print(array[i] +" ");
//		}

	}

}
