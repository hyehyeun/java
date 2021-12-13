import java.util.Scanner;

public class KarMain {

	public static void main(String[] args) {
		
		SngKar kar = new SngKar();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전진 값>>");
		int num = sc.nextInt();
		kar.go(num);
		System.out.print("현재 위치>>" + kar.sngKarPosition);
		kar.parking();
		//후진값
		//부스터값
		
		//최종 차의 위피를 알려주는 프로그램!!
		KartRider2 kar2 = kar;
		kar2.parking();

	}

}
