package 월급계산프로그램;

public class RegualEmployee {
	
	String empno;//사번
	String name; //이름
	int pay; //연봉
	int bonus; //보너스
	public RegualEmployee(String empno, String name, int pay, int bonus) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}
	//월급여 계산 메소드
	public int getMaoneyPay() {
		return(pay+bonus)/12;
	}
	//사번:이름:연봉 출력
	public void print() {
		System.out.println(this.empno+" : " + this.name+ " : "+this.pay);
		
	}
	

}
