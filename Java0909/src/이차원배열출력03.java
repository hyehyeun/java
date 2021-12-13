import java.util.Scanner;

public class 이차원배열출력03 {

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
		for (int i = 0; i < array.length; i++) {
			// 열을 의미하는 반복문
			for (int j = 4; j>=0; j--) {
				System.out.print(array[i][j] + "\t");

			}
			System.out.println();
		}


	}

}
