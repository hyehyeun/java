import java.util.ArrayList;

public class PoketMain {

	public static void main(String[] args) {
		
		//���ϸ� ���� ��Ȯ�� �� �� ����.
		//���ϸ� ������ ����� �����ϴ��� �� �� ����.
		
		ArrayList<Poketmon> poktList = new ArrayList<Poketmon>();
		Poketmon pika = new Poketmon("��ī��","����", 80,60,70);
		Poketmon piri = new Poketmon("���̸�","��", 90,40,50);
		
		//���ϸ󵵰� �߰�
		poktList.add(pika);
		poktList.add(piri);
		
		
		System.out.println("��ī�� ���ݷ� : "+poktList.get(0).getAttack());
		
		//���ϸ� ���� ����� 5����
		
	

	}

}
