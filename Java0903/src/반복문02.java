import java.util.Scanner;

public class �ݺ���02 {

	public static void main(String[] args) {

		// 10���� �������� �Է��Ѵٸ� �ݺ�
		// 10���� ū���� �Է��Ѵ� ����!

//		if(true) {
//			System.out.println("����!");
//		}

		System.out.println("�����Է� : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// while ==> ��� �ݺ� �ؾ��ϴ��� �𸣴� ��쿡 ���
		while (true) {
			System.out.println("�����Է� : ");
			num = sc.nextInt();
			if (num > 10) {
				break;
			}

		}

		System.out.println("���α׷� ����..");

	}

}
