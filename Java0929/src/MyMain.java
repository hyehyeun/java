import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		System.out.println("======�����̱�======");
		Scanner sc = new Scanner(System.in);

		// ��踦 ���� ������ ������ �̾��ּ���!!
		Machine m = new Machine();
		
		//��ī������ �̰����
		Pika pika = new Pika();
		m.run(pika);
		pika.get2();
		//������ ������ �̰����
		Kkobuk kkobuk = new Kkobuk();
		m.run(kkobuk);
		//���̸� ������ �̰����
		Piri piri = new Piri();
		m.run(piri);
		
		//�߻�Ŭ������ ��ü(����)�� ���� ������ ��ü�� ������ �Ұ��� �ϴ�!!!
		//�ӽ������δ� ���� ���������� ���� ������� �ʴ´�!!!
		//�߻�Ŭ������� ���� ����Ŭ�������� ������ �κ��� �����س������̱� ������
		Doll doll = new Doll() {
		
		
		@Override
		public void get() {
			
		}
	};
	Doll doll2 = new Pika();
}
		
//		while(true) {
//			System.out.print("[1]��ī�� [2]���̸�[3]������");
//			int choice = sc.nextInt();
//			
//			if(choice == 1) {
//				System.out.println(Pika.class);
//				
//			}else if(choice ==2) {
//				System.out.println(Piri.class);
//			}else if(choice ==3) {
//				System.out.println(Kkobuk.class);
//			}
//			
//		}
//		
			
		}

	


