import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		System.out.println("������ �Է� ���ּ���>> ");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		//100~90 �����ڸ� : 10 or 9
		//89~80 �����ڸ� : 8
		//79~70 �����ڸ� :7
		
		switch(grade/10) { //�� ����� �ɰ�! case ���Ұ�:
		//ctrl + alt + ����Ű
		case  10:
		case  9:
			System.out.println("A���� �Դϴ�!");
			break;
		case 8  :
			System.out.println("B���� �Դϴ�!"); 
			break;
		case 7   :
			System.out.println("C���� �Դϴ�!");
			break;
		default :
			System.out.println("���Ф�");
			break;
	}
	}

}

