import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = new int[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + "��° ��");
			array[i] = sc.nextInt();
		}
		// ��������
		for (int i = 0; i < array.length; i++) {

			int maxNum = array[i];
			int maxNumIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (maxNum < array[j]) {
					maxNumIndex = j;
					maxNum = array[j];

				}
			}
			int temp = array[i];
			array[i] = array[maxNumIndex];
			array[maxNumIndex] = temp;
		}

		// �迭���
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
