package bank;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		System.out.println("===== 돼지 저금통 시뮬레이터 =====");
		System.out.println("[1]입금하기 [2]출금하기 [3]잔액확인");

		Scanner sc = new Scanner(System.in);   //입력받는 클래스 ! 
		int choice = sc.nextInt();

		PiggyBank piggy = new PiggyBank();  // 돼지저금통 객체 형성된 것!!! 
		
		if (choice == 1) {
			System.out.println("저금할 금액 입력 : ");
			int input_money = sc.nextInt();
			int result_money = piggy.deposit(input_money);
			System.out.println("현재 누적된 금액 : " + result_money);
		} else if (choice == 2) {
			System.out.println("출금할 금액 입력 : " );
			int out_money = sc.nextInt();
			boolean result = piggy.withdraw(out_money);
			if (result == true) {
				System.out.println("출금 성공!!");
			} else {
				System.out.println("출금 실패!!");
			}
		} else if (choice == 3) {
			int m = piggy.getMoney();
			System.out.println("현재 잔액 : " + m);

		}

	}

}
