import java.util.Scanner;

public class Dowhile01 {

	public static void main(String[] args) {

        //�����ϴ� ���� 5�� �ݺ��ؼ� ���
		
 		int num=4;
//		while(num<=5) {
//			System.out.println("6");
//			num++;
//		}
 		
//		do {
//			System.out.println("6");
//			num++;
//			
//		}while(num<=5);
 		Scanner sc = new Scanner(System.in);
 		
 		System.out.print("��������� : ");
 		int numA = sc.nextInt();
 		
 		System.out.print("��ǥ������ : ");
 		int numB = sc.nextInt();
	
 		do  {
 			System.out.print("1���� ���� ������ : " + (num));
 			System.out.print("2���� ���� ������ : " + (num));
 			System.out.print("3���� ���� ������ : " + (num));
 			System.out.print("4���� ���� ������ : " + (num));			
 			
 		 num++;
 		 
 		} while(num+1<=5);
 		
 		System.out.println("66kg �޼�!! ���ϵ帳�ϴ�!");
 			
 		}
 		
 		

	}

