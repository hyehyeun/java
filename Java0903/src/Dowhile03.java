import java.util.Random;
import java.util.Scanner;

public class Dowhile03 {

	public static void main(String[] args) {
		// �������� ����2���� �̾� �Ʒ��� ���� ���
		// ����ڴ� �� ���� ���� �Է�
		// �� ���� �հ� �Է��� ���� ��ġ�ϸ� "Success"
		// �� ���� �հ� �Է��� ���� ��ġ���� ������ ������ "Fail"
		// 1~100 ������ ���� 2���� �̾� ������ �ϴ� ������ ������.
		

		// �����̱�

		// Random random = new Random();
		// int num = random.nextInt(20)+1;
		// 0~19���� ���� �߻� �����
		
		System.out.println("==Plus Game==");
		Scanner sc = new Scanner(System.in);
		

		Random random = new Random();
		int num1 = random.nextInt(100)+1;      //0~99
		int num2 = random.nextInt(100)+1;
		System.out.print(num1+"+"+num2+"=");

		int num3 = sc.nextInt();
		

		if (num1+num2 == num3) {
			System.out.println("Success");
		}
		
		else {
			System.out.println("Fail");
		}

	}

}
