package bank;

public class PiggyBank {
	// �ʵ�
	int money; // ���ݵ� ��
	// �޼ҵ�
	// 1. ���� �ִ� ���(deposit)
	// �Է����� : ������ 1�� (�Էµ� ��)
	// ��ȯŸ�� : ������ 1�� (���� �����뿡 ��� �ִ� ������ �ݾ�)


	public int deposit(int input_money) {
		money += input_money; //money = money+input_money;
										// ������
		return money;


	}
	//2. ���� ���� ���(withdraw)
	// �Է����� : ������ 1�� (���� ���� �ݾ�)
	// ��ȯŸ�� : ���� 1�� (��ݿ� �����ϸ� true, �����ϸ� false)
	public boolean withdraw(int out_money) {
		if(money >= out_money) {
			money-= out_money;
		
		
		return true;
		}else {
			return false;
		}
	}
		//3. ���� �ܾ� Ȯ�� ���(getMoney)
		// �Է����� : X
		// ��ȯŸ�� : ������ 1��(���� �ܾ�)
		public int getMoney() {					
			return money;				
	}
}
