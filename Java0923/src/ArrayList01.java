import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {

	public static void main(String[] args) {
		String[] name = new String[3];
		
		//ArrayList ����
		ArrayList<String> nameArray = new ArrayList<String>();
		
		// �� �ʱ�ȭ
		// �迭 ù��°�� �� �ʱ�ȭ
		name[0] = "��ȯ";
		
		//arrayList �� �߰� //�� �ڷ� ����
		nameArray.add("��ȯ");
		nameArray.add("����");
		
		//�� ��������
		System.out.println(name[0]);
		System.out.println(nameArray.get(0));
		System.out.println(nameArray.get(1));
		
		//�� ����
		nameArray.add(1,"����");
		System.out.println(nameArray.get(1));
		nameArray.add(2,"�ص�");
		System.out.println(nameArray.get(2));
		
		//ũ��
		System.out.println("������ ũ��" + name.length);
		System.out.println("��̸���Ʈũ��"+nameArray.size());
		
		//����
		name[0] = ""; //�Ϲݹ迭 --> ������°����� ����
		//���� �ϰ������ ������ �ʱ�ȭ�� �����ϴ�! ==>
		nameArray.remove(1);
		
		System.out.println(name);
		System.out.println(Arrays.toString(name));		
		System.out.println(nameArray);
		//ArrayList�� toString�� �⺻������ �����ϰ��ִ�!

	}

}
