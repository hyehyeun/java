import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//10���� �� ��ȭ��ȣ�� �迭����
		PersonInfo[] list = new PersonInfo[10];
		
		System.out.print("�̸��Է�>>");
		String name = sc.next();
		
		System.out.print("��ȣ>>");
		String number = sc.next();
		
		System.out.print("�����Է�>>");
		String birthday = sc.next();
		
		PersonInfo info = new PersonInfo(name,number,birthday);
//		info.setName(name);
//		info.setNumber(number);
//		info.setBirthday(birthday);
		
		System.out.println(info.getName()); //name �� ��������
		System.out.println(info.getNumber()); //number�� ��������
		System.out.println(info.getBirthday()); //birth�� ��������
		
		list[0] = info; //��ȭ��ȣ ������ ����
		//�����е��� ���� ��ȭ��ȣ�θ� (list)�� ������ּ���
		
		PersonInfo info2 = new PersonInfo("","","");		
		list[1] = info2;
		
		for(int i = 0; i<list.length; i++) {			
			System.out.print("�̸��Է�>>");
			String name1 = sc.next();
			
			System.out.print("��ȣ>>");
			String number1 = sc.next();
			
			System.out.print("�����Է�>>");
			String birthday1 = sc.next();
			list[i] = info3;
		}
		System.out.println("�̸����>>"+list[1].getName());
		System.out.println("��ȣ���>>"+list[1].getNumber());
		System.out.println("�������>>"+list[1].getBirthday());
	}

}
