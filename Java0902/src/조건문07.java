import java.util.Scanner;

public class ���ǹ�07 {

	public static void main(String[] args) {
		System.out.println("�ݾ��� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int Money = sc.nextInt(); // Money => ����ڰ� ���� �ݾ�

		System.out.println("�޴��� ������");
		System.out.println("1. �ݶ�(800��) 2.����(500��) 3. ��Ÿ�ο���(1500��)");
		int menu = sc.nextInt(); // --> ����ڰ� ��Ÿ� �Է��ߴ���? �� �ȹ޾� �ּ̾��!
		//�׷��� menu ��� ������ ������ �Ʒ��� �ν��� ���� ������ �������ϴ�!
		// ��! �����մϴ� ���صƾ��!
		if (menu == 1) {
			Money = Money - 800;
		}
		else if (menu == 2) {
			Money = Money - 500;
		} else if (menu == 3) {
			Money = Money - 1500;
		}
		System.out.println("�ܵ� : " + Money + "��");
	}
}
