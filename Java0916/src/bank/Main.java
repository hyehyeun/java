package bank;

public class Main {

	public static void main(String[] args) {
		// ���� ������ ���� (Object)
		// Ŭ������ ������ = new Ŭ������();
		PiggyBank p1 = new PiggyBank();

		PiggyBank p2 = new PiggyBank();
		
		int result_p1 = p1.deposit(5000);
		System.out.println("p1 ���� ������ �ݾ� : " +result_p1);
		
		result_p1 = p1.deposit(1000);
		System.out.println("p1 ���� ������ �ݾ� : " +result_p1);
		
		int result_p2 = p2.deposit(9000);
		System.out.println("p2 ���� ������ �ݾ� : " +result_p2);
		
		boolean isSuccess = p2.withdraw(5000);
		if(isSuccess) {
			System.out.println("��� ����!!");
		}else {
			System.out.println("��� ����!!");
		}
		
		int result = p1.getMoney();
		System.out.println("p1�� ���� �ݾ� : " + result);
		
		//Ŭ������ �ʵ带 ���鶧�� �Ϲ������� private�� �ٿ���
		//�����͸� ��ȣ����!!, ���� �޼ҵ�� ������ �� �� �ְ��ؾ� ��Ʈ���� ����������.
		
		//p1.money = -1000;

	}

}
