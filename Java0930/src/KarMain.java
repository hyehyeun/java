import java.util.Scanner;

public class KarMain {

	public static void main(String[] args) {
		
		SngKar kar = new SngKar();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ��>>");
		int num = sc.nextInt();
		kar.go(num);
		System.out.print("���� ��ġ>>" + kar.sngKarPosition);
		kar.parking();
		//������
		//�ν��Ͱ�
		
		//���� ���� ���Ǹ� �˷��ִ� ���α׷�!!
		KartRider2 kar2 = kar;
		kar2.parking();

	}

}
