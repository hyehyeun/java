import java.util.Scanner;

public class Dowhile02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���������:");
		int nowKg = sc.nextInt();
		
		System.out.print("��ǥ������:");
		int wantKg = sc.nextInt();
		
		int week=1; //���������� �˱����� ����
		do {
			//�컩�� ����
			
			System.out.println(week+"���� ���� ������:");
			int lossKg = sc.nextInt();
			nowKg = nowKg-lossKg; //���� ������ ����
			
			week++;
			
		} while(nowKg>wantKg);
		
		System.out.println(nowKg+"kg �޼�!! �����մϴ�!");
		
	}

}
