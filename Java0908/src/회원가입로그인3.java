import java.util.Scanner;

public class ȸ�����Էα���3 {

	public static void main(String[] args) {
		// 1.ȸ������ 2.�α��� 3.����
		Scanner sc = new Scanner(System.in);
		System.out.println("==== ȸ������ �ý��� ====");
		String[] id_array = { "", "", "" }; // �迭 �����Ҷ� �̷��� ���� �ٷ� �־��شٸ� new String �̶�� Ű����� ����� �˴ϴ�!
		String[] pw_array = { "", "", "" };
		int i = 0;

		while (true) {
			System.out.println("1.ȸ������ 2.�α���  3.����");
			int choice = sc.nextInt();
			System.out.println();

			if (choice == 1) { // ȸ������
				System.out.println("==== ȸ������ ====");
				System.out.print("id �Է� : ");
				id_array[i] = sc.next();

				System.out.print("pw �Է� : ");
				pw_array[i] = sc.next();
				i++;
				System.out.println("���� ����");

			} else if (choice == 2) { // �α���
				System.out.println("=== �α���  ===");
				// id�� pw�� �Է¹ް� �װ��� id_array�� pw_array�� �ִٸ�
				// '�α��� ����'�� ����ϰ�, �ƴ϶�� '�α��� ����' ����ϼ���
				System.out.print("id>>");
				String input_id = sc.next();

				System.out.print("pw>>");
				String input_pw = sc.next();
				int count = 0;
				for (int j = 0; j < id_array.length; j++) {
					if (id_array[j].equals(input_id) && pw_array[j].equals(input_pw)) {

						System.out.println("�α��� ����");
						count++;
					}

				}
				if (count == 0) {
					System.out.println("�α��� ����");
				}

			} else if (choice == 3) { // ���α׷� ����
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else
				System.out.println("��ȣ�� �ùٸ��� �Է��ϼ���!!");
		}

	}

}
