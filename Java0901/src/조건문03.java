import java.util.Scanner;

public class ���ǹ�03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int number = sc.nextInt();
		// ���п����� �� =
		//java ������ �� == , !=
		if(number%2 ==0) {
			System.out.println(number+"�� ¦�� �Դϴ�");
		}
		else {
			System.out.println(number+"�� Ȧ�� �Դϴ�.");
		}
	}

}
