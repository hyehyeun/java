import java.util.Random;

public class �޴����ø޼ҵ� {

	public static void main(String[] args) {
		// �޴����� �޼ҵ� : ������ָ� ���� ���� ���� �޼ҵ�
		// �޼ҵ� ȣ��
		String menu_name = selectMenu();
		System.out.println("���� ���� ������>>"+ menu_name);
		

	}
	// �޼ҵ� ����               �ε��� 0 ~ 8
 	public static String selectMenu() {
		String[] name = {"¥���","���","�̸�","����",
						"����","ġŲ","����","ũ�����뱹","���"};
		
		Random rd = new Random(); //�޴� �ε����� ���� ����
		int index = rd.nextInt(name.length);
		
		return name[index];
		
	}

}
