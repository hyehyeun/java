import java.util.Scanner;

public class ���ǹ�04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >>");
		int number = sc.nextInt();
		
		int oneJali = number%10;
		
		if(oneJali>=5) {
			number = (number-oneJali)+10;
		}
		else {
			number = number-oneJali;
		}
		System.out.println("�ݿø��� : "+number);
		

	}

}
