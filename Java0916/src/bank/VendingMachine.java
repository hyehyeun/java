package bank;

public class VendingMachine {
	
	private int money;
	private int total_money = 100000;
	private int manu_s = 900;
	private int manu_c = 1000;
	private int object_s = 10;
	private int object_c = 10;
	
	
	public int input_money(int input_money) {
		money += input_money;
		total_money += input_money;
		return money;
	}
	public int choice_manu(int manu) {
		if(manu == 1) {
			if(money - manu_s > 0) {
			money -= manu_s;
			}else {
				System.out.println("�ܾ׺���");
			}
		} else if(manu ==2) {
			if(money - manu_s > 0) {
				money -= manu_c;
				object_c--;
			} else {
				System.out.println("�ܾ׺���");
			}
		} return money;
	}
	public void output_money() {
		System.out.println("�ܵ��� ��ȯ�մϴ�");
		if(money >= 10000) {
			System.out.println("10000�� : " + (money/10000)+"�� ");
			System.out.println("5000�� : " + (money %10000/5000)+"�� ");
			System.out.println("1000�� : " + (money %10000%5000/1000)+"�� ");
			System.out.println("500�� : " + (money %10000%5000%1000/500)+"�� ");
			System.out.println("100�� : " + (money %10000%5000%1000%500/100)+"�� ");
			} else if (money >= 5000) {
				System.out.println("5000�� : " + (money %5000)+"�� ");
				System.out.println("1000�� : " + (money %5000/1000)+"�� ");
				System.out.println("500�� : " + (money %5000%1000/500)+"�� ");
				System.out.println("100�� : " + (money %5000%1000%500/100)+"�� ");	
			} else if(money >= 1000) {
				System.out.println("1000�� : " + (money/1000)+"�� ");
				System.out.println("500�� : " + (money%1000/500)+"�� ");
				System.out.println("100�� : " + (money %1000%500/100)+"�� ");
			}else if(money>=500) {
				System.out.println("500�� : " + (money/500)+"�� ");
				System.out.println("100�� : " + (money %500/100)+"�� ");
			}else if(money >=100) {
				System.out.println("100�� : " + (money /100)+"�� ");
			}
		total_money -= money;
		money = 0;
	}
	public void manager() {
		System.out.println("�� �ܾ� : " + total_money);
		System.out.println("���̴� : " + object_s);
		System.out.println("�ݶ� : " + object_c);
	}
}
