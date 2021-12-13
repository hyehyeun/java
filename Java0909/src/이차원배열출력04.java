import java.util.Scanner;

public class 이차원배열출력04 {

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
		for (int col = 0; col < array.length; col++) {
			// 열을 의미하는 반복문
			for (int row = 4; row>=0; row--) {
				System.out.print(array[row][col] + "\t");

			}
			System.out.println();
		}

	}

}
