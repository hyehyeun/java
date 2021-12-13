package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		//RegularEmployee 객체 생성
		RegualEmployee regular = new RegualEmployee("smhard01","승환",3000,300);
		regular.print();
		System.out.println(regular.getMaoneyPay()+"만원");
	}

}
