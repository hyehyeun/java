import java.util.Scanner;

public class ���ǹ�06_1 {

	public static void main(String[] args) {
		
		//��ǻ�;� �ʰ� ������ �Է��ϼ��� ��� ���Ѵٸ�
		//������ �Է����״� �ʴ� grade��� ������ �����
		//grade�� 90�̻��̸� 'A���� �Դϴ�' �� ����ϰ�
		//grade�� 90�� �̸� 80�̻��̸� 'B���� �Դϴ�' �� ����ϰ�
		//grade�� 80�� �̸� 70�̻��̸� 'C���� �Դϴ�' �� ����ϰ�

		
		System.out.println("������ �Է��ϼ���>>");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		if(grade>=90){
			System.out.println("A�����Դϴ�.");
		}
		else if(grade>=80 && grade<90){
			System.out.println("B�����Դϴ�.");
		}
		else if(grade>=70 && grade<80){
			System.out.println("C�����Դϴ�.");
		}
		
		if(grade>=60) {
			System.out.println("D");
		}
		if(grade>=50) {
			System.out.println("���Ф�");
	}
	}

}
