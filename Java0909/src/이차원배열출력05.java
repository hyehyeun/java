import java.util.Scanner;

public class 이차원배열출력05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[5][5];
		int data = 21;

		// 행을 의미하는 반복문
		for (int i = 0; i < array.length; i++) {
			// 열을 의미하는 반복문
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = data;
				data++;
			}
		}
		// 이차원배열 데이터 출력
		for (int row = 4; row>=0; row--) {
			// 열을 의미하는 반복문
			for (int col = 4; col>=0; col--) {
				System.out.print(array[col][row] + "\t");

			}
			System.out.println();
		}

	}

}
