import java.util.Scanner;

public class ȸ�����Էα��� {

	public static void main(String[] args) {

		// 1.ȸ������ 2.�α��� 3.����
		System.out.println("==== ȸ������ �ý��� ====");
		Scanner sc = new Scanner(System.in);
		String[] id_array = new String[3];
		String[] pw_array = new String[3];
		while (true) {
			System.out.println("1.ȸ������ 2.�α���  3.����");
			int choice = sc.nextInt();

			if (choice == 1) { // ȸ������
				System.out.println("==== ȸ������ ====");
				System.out.print("id �Է� : ");				
				String id = sc.next();
				System.out.print("pw �Է� : ");
				String pw = sc.next();
				System.out.println("���� ����");
				
			} else if (choice == 2) { // �α���
				System.out.println("=== �α���  ===");
			} else if (choice == 3) { // ���α׷� ����
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else
				System.out.println("��ȣ�� �ùٸ��� �Է��ϼ���!!");
		}

	}

}
