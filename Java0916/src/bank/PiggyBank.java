package bank;

public class PiggyBank {
	// 필드
	int money; // 저금된 돈
	// 메소드
	// 1. 돈을 넣는 기능(deposit)
	// 입력인자 : 정수형 1개 (입력된 돈)
	// 반환타입 : 정수형 1개 (현재 저금통에 들어 있는 누적된 금액)


	public int deposit(int input_money) {
		money += input_money; //money = money+input_money;
										// 기존값
		return money;


	}
	//2. 돈을 빼는 기능(withdraw)
	// 입력인자 : 정수형 1개 (빼고 싶은 금액)
	// 반환타입 : 논리형 1개 (출금에 성공하면 true, 실패하면 false)
	public boolean withdraw(int out_money) {
		if(money >= out_money) {
			money-= out_money;
		
		
		return true;
		}else {
			return false;
		}
	}
		//3. 현재 잔액 확인 기능(getMoney)
		// 입력인자 : X
		// 반환타입 : 정수형 1개(현재 잔액)
		public int getMoney() {					
			return money;				
	}
}
