import java.util.Scanner;

public class ���ǹ�03 {

	public static void main(String[] args) {

		// ��ǻ�;� ���� ���� �ΰ��� �Է��ϰ� ������ �ʴ�
		// 'A�Է�', 'B�Է�', �̶�� ����� ���شٸ�
		// ���� ���ڸ� �־��ٰ� �׸��� �ʴ� �� ���ڸ� A-B �� ������ظ��
		// ���� ������ ����ؼ� �ݺ��ϵ�
		// �׷��� ���� ���� A�� B�� 0, 0�� �Է��ߴٸ� -> ���α׷� ���������

		Scanner sc = new Scanner(System.in);

		// while ==> ��� �ݺ� �ؾ��ϴ��� �𸣴� ��쿡 ���
		
		

		while (true) {
			System.out.print("A �Է� >> ");
			int numA = sc.nextInt();

			System.out.print("B �Է� >>");
			int numB = sc.nextInt();

			System.out.println("���>>" + (numA - numB));

			if (numA == 0 && numB == 0) {
				break;
			}

		}
		System.out.println("���α׷� ����");
	}
}
