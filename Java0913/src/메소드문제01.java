import java.util.Scanner;

public class �޼ҵ幮��01 {

	public static void main(String[] args) {
		// Ű����κ��� �Է¹��� �� ���� ������ ����(�Ű�����)�� �Ѱܹ޾�
		// num1���� num2�� �� ������� ���밪���� �ٲپ� ����ϴ�
		// getAvsoluteValue() �޼ҵ带 �����ϼ���.

		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();

		int result = getAvsoluteValue(num1, num2); //�޼ҵ� ȣ��!! 
	}

	public static int getAvsoluteValue(int num1, int num2) {
		int result = num1 - num2;
		if(result<0) {
			result=-result;
			System.out.println("���Ȯ�� : " + result);
		}

		return result;

	}

}
