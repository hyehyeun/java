import java.util.Scanner;

public class 조건문07 {

	public static void main(String[] args) {
		System.out.println("금액을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int Money = sc.nextInt(); // Money => 사용자가 넣은 금액

		System.out.println("메뉴를 고르세요");
		System.out.println("1. 콜라(800원) 2.생수(500원) 3. 비타민원터(1500원)");
		int menu = sc.nextInt(); // --> 사용자가 어떤거를 입력했는지? 를 안받아 주셨어요!
		//그래서 menu 라는 변수가 없으니 아래서 인식을 못해 오류가 났었습니다!
		// 네! 감사합니다 이해됐어요!
		if (menu == 1) {
			Money = Money - 800;
		}
		else if (menu == 2) {
			Money = Money - 500;
		} else if (menu == 3) {
			Money = Money - 1500;
		}
		System.out.println("잔돈 : " + Money + "원");
	}
}
