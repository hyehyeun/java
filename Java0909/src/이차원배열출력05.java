import java.util.Scanner;

public class �������迭���05 {

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
		for (int row = 4; row>=0; row--) {
			// ���� �ǹ��ϴ� �ݺ���
			for (int col = 4; col>=0; col--) {
				System.out.print(array[col][row] + "\t");

			}
			System.out.println();
		}

	}

}
