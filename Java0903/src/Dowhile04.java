import java.util.Random;
import java.util.Scanner;

public class Dowhile04 {

	public static void main(String[] args) {

		// 1~100 ������ ���� 2���� �̾� ������ �ϴ� ������ ������.
		// ����� ���ÿ� ���� ���� ���� �Ǵ� ���� ������ �ǵ��� ����.

		System.out.println("==Plus Game==");
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		String yesOrNo;

		do {
			System.out.println("1[����] 2.[����] >> ");

			int choice = sc.nextInt();

			int num1 = random.nextInt(100) + 1; // 0~99
			int num2 = random.nextInt(100) + 1;

			if (choice == 1)
				System.out.println(num1 + "+" + num2 + "=");

			else if (choice == 2)
				System.out.println(num1 + "-" + num2 + "=");

			int num3 = sc.nextInt(); // ���� �Է�

			if (choice == 1)
				if (num1 + num2 == num3) {
					System.out.println("Success");
				} else {
					System.out.println("Fail");
				}

			else if (choice == 2) {
				if (num1 + num2 == num3) {
					System.out.println("Success");
				} else {
					System.out.println("Fail");
				}
			}

			System.out.print("��� �Ͻðڽ��ϱ�?(Y/N) : ");
			yesOrNo = sc.next();

		} 
		while (yesOrNo.equals("Y") || yesOrNo.equals("y"))
			;

	}

}
