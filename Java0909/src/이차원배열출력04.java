import java.util.Scanner;

public class �������迭���04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[5][5];
		int data = 21;

		// ���� �ǹ��ϴ� �ݺ���
		for (int i = 0; i < array.length; i++) {
			// ���� �ǹ��ϴ� �ݺ���
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = data;
				data++;
			}
		}
		// �������迭 ������ ���
		for (int col = 0; col < array.length; col++) {
			// ���� �ǹ��ϴ� �ݺ���
			for (int row = 4; row>=0; row--) {
				System.out.print(array[row][col] + "\t");

			}
			System.out.println();
		}

	}

}
