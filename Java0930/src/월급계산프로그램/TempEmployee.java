package 월급계산프로그램;

public class TempEmployee {

	String empno;// 사번
	String name; // 이름
	int pay; // 연봉

	public TempEmployee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	// 월급여 계산 메소드
	public int getMaoneyPay() {
		return pay/12;
	}

	// 사번:이름:연봉 출력
	public void ptint() {
		System.out.println(this.empno + " : " + this.name + " : " + this.pay);

	}
}
