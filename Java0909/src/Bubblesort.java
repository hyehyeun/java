import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		
		//ũ�Ⱑ 5�� ������ �迭 array�� �����
		//����ڰ� �Է��� ������ �ʱ�ȭ �����ּ���!
		
		int[] array = new int[5]; 
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<array.length; i++) {
			System.out.println((i+1)+ "��° ��");
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		
		
		
		
		
		
		
//		//��������
//		for(int i=0;i<array.length;i++ ) {
//			//step �ȿ��� �񱳰� �Ǵ� �ݺ���
//			for(int j=0; j<array.length-(i+1);j++) { 
//				if(array[j]>array[j+1]) {
//					int temp = array[j+1];
//					array[j+1] = array[j];
//					array[j] = temp;
//				}
//			}
//		}
		
		
		
		
		
		//�迭 ���
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+" ");
			
		}
//		���� for��
//		ġȯ -> ������ ���� �ٲٱ�
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
