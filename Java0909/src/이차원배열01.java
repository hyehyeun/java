import java.util.Scanner;

public class �������迭01 {

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

		
		//���߹ݺ������� array�� ���� �־��ּ���
		//1 ~ 16������ ���� �־��ּ���
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[4][4];
		int data = 1;
		
		//���� �ǹ��ϴ� �ݺ���
		for(int i = 0; i<array.length; i++) {
			//���� �ǹ��ϴ� �ݺ���
			for(int j = 0; j<array[0].length; j++) {
				array[i][j]=data;
				data++;
			}
			}
		for(int i = 0; i<array.length; i++) {
			//���� �ǹ��ϴ� �ݺ���
			for(int j = 0; j<array[0].length; j++) {
				System.out.println(array[i][j]);
			}
			}
		
		
		
		

	}

}
