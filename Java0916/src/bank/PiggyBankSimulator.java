package bank;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		System.out.println("===== ���� ������ �ùķ����� =====");
		System.out.println("[1]�Ա��ϱ� [2]����ϱ� [3]�ܾ�Ȯ��");

		Scanner sc = new Scanner(System.in);   //�Է¹޴� Ŭ���� ! 
		int choice = sc.nextInt();

		PiggyBank piggy = new PiggyBank();  // ���������� ��ü ������ ��!!! 
		
		if (choice == 1) {
			System.out.println("������ �ݾ� �Է� : ");
			int input_money = sc.nextInt();
			int result_money = piggy.deposit(input_money);
			System.out.println("���� ������ �ݾ� : " + result_money);
		} else if (choice == 2) {
			System.out.println("����� �ݾ� �Է� : " );
			int out_money = sc.nextInt();
			boolean result = piggy.withdraw(out_money);
			if (result == true) {
				System.out.println("��� ����!!");
			} else {
				System.out.println("��� ����!!");
			}
		} else if (choice == 3) {
			int m = piggy.getMoney();
			System.out.println("���� �ܾ� : " + m);

		}

	}

}
