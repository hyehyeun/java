import java.util.Scanner;

public class StudentSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stuList = new Student[10]; // ��ϵ� �л����� ����
		int index = 0; // ����� �л��� ��ġ
		
		System.out.println("==== SMHRD �������� �ý��� ====");
		
		while(true) {
			System.out.println("[1]�л���� [2]��������[3]����");
			int choice = sc.nextInt();
			
			if(choice ==1) {
				System.out.print("����� �л� �̸�>>");
				String name = sc.next();
				System.out.print("����� �л� �й�>>");
				String stuNumber = sc.next();
				
				Student st = new Student(name,stuNumber);
				
				if(index < stuList.length) {   //�迭 ������ �����ϱ� ���ؼ� .length ��
				stuList[index++] = st;
			} else {
				System.out.println("�� �̻� �л��� ����� �� �����ϴ�.");
			}	
			}else if(choice == 2) {
				System.out.println("������ �л� �̸�>> ");
				String name = sc.next();
				// �ش� �л��� �˻�(������ ��ġ : �迭�� 0������ ���������� ��)
				int stuIndex = -1; //ã�� �л��� ��ġ
				for(int i = 0; i<index; i++) { // ��ϵ� �л������� �˻��ϵ��� index �� 3���̸� 3��,4���̸� 4��
					if(name.equals(stuList[i].getName())) {
						stuIndex = i;
					}
				}
				if(stuIndex == -1) {
					System.out.println("��ϵ� �л��� �����ϴ�.");
				}else {
					// 1. �ѹ��� �� ���� ����
					// 2. �ѹ��� 3���� ��� ����
					
					while(true) {
						System.out.println("������ ������ �������ּ���");
						System.out.println("[1]java[2]web[3]iot[4]��");
						int subject = sc.nextInt();
						
					}
				}
				}else if(choice == 3){	
					break;
	}
	}
}
}