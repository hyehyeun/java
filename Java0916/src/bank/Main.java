package bank;

public class Main {

	public static void main(String[] args) {
		// 돼지 저금통 생성 (Object)
		// 클래스명 변수명 = new 클래스명();
		PiggyBank p1 = new PiggyBank();

		PiggyBank p2 = new PiggyBank();
		
		int result_p1 = p1.deposit(5000);
		System.out.println("p1 현재 누적된 금액 : " +result_p1);
		
		result_p1 = p1.deposit(1000);
		System.out.println("p1 현재 누적된 금액 : " +result_p1);
		
		int result_p2 = p2.deposit(9000);
		System.out.println("p2 현재 누적된 금액 : " +result_p2);
		
		boolean isSuccess = p2.withdraw(5000);
		if(isSuccess) {
			System.out.println("출금 성공!!");
		}else {
			System.out.println("출금 실패!!");
		}
		
		int result = p1.getMoney();
		System.out.println("p1의 현재 금액 : " + result);
		
		//클래스의 필드를 만들때는 일반적으로 private을 붙여서
		//데이터를 보호하자!!, 허용된 메소드로 접근을 할 수 있게해야 컨트롤이 가능해진다.
		
		//p1.money = -1000;

	}

}
