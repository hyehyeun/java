import java.util.Scanner;

public class ���ǹ�05_1 {

	public static void main(String[] args) {
		//�Ļ�ð� 1~2�ñ���
		// �Ļ�ð�(����) �� �Է� �޾Ƽ� (�� �Է�X) --> 1 �̶�� ���ڸ� �Է���������
		// 1~2 ���̶�� '�Ļ� �ð��Դϴ�'�� ���
		// '����, ����, ȭ����!' �� ����ϴ� ���α׷��� ����� �ּ���!
		
		
		//��ǻ�;� ��ö�� �ʰ� ����ٸ� ���� �ð��� �Է����ٰ�
		//�׷� �ʴ� �� �ð��� time �̶�� ������ �����
		//�׸��� time �� �ִ°��� 1~<2tkdlfkaus '�Ļ� �ð��Դϴ�' �� ����ϰ�,
		//�ƴ϶�� '����,����,ȭ����!'
		
		System.out.print("���??");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		
		if(time>=1 && time<2) {
			System.out.println("�Ļ�ð� �Դϴ�");
		}
		else {
			System.out.println("����, ����, ȭ����!");
		}
	}

}
