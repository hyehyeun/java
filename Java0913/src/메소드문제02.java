
public class �޼ҵ幮��02 {

	public static void main(String[] args) {
		// 2���� ������ �޾� 2���� ���� �� 10�� �� ����� ����
		// ��ȯ�ϴ� �޼ҵ� close10�� ��������
		// (���� �� ���� ��� 10���� ���̰� ���ٸ� 0�� ��ȯ)

		int num1 = 11;
		int num2 = 5;
		System.out.println("�� ����� �� : " + close10( num1, num2));

	}

	public static int close10(int num1, int num2) {

		int resultNum1 = 10 - num1;
		int resultNum2 = 10 - num2;
		
		if (resultNum1 < 0) {
			resultNum1 = -resultNum1;
		}
		if (resultNum2 < 0) {
			resultNum2 = -resultNum2;
		}
		if (resultNum1 > resultNum1) {
			return num2;
		} else if (resultNum2 > resultNum1) {
			return num1;
		} else {
			return 0;
		
		
		}
		}
	}
