import java.util.Scanner;

public class ���ǹ�05 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���ѽð��� �Է��ϼ��� : >>");
//		int hour = sc.nextInt();
//		int A = hour*5000;
//		hour = (number*1.5);
//		if(hour>8){
//	
//		System.out.println("�� �ӱ���"+(40000+)"�� �Դϴ�.");}

		//��ǻ�;� �ʰ� ���� �ð� �Է� �̶�� ���ϸ� ���� ���� �ð��� �Է��Ұ�
		//�׷� �ʴ� �� ���� workTime�̶�� ������ �����
		//�׸��� workTime�� ��� ���� 8���� ũ�ٸ�
		//8�ð� ���ķδ� ���� �ð� ���ʹ� 5000���� 1.5���� 7500������ �ñ��� �������
		//���Ŀ� �ʴ� �� �ϴ��� ����� �ָ��!
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ð� �Է� >>");
		int workTime = sc.nextInt();
		int resultMoney=0;
		
		if(workTime>8) {
		 resultMoney = (int) (8*5000+(workTime-8)*5000*1.5);
			System.out.println("�� �ӱ� : "+ resultMoney);
		}
		
		else {
			 resultMoney = workTime*5000;
			System.out.println("�� �ӱ� :"+resultMoney);
		    
		}
	
	}

}
