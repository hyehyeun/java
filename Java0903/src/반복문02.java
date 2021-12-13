import java.util.Scanner;

public class 반복문02 {

	public static void main(String[] args) {

		// 10보다 작은수를 입력한다면 반복
		// 10보다 큰수를 입력한다 종료!

//		if(true) {
//			System.out.println("열공!");
//		}

		System.out.println("숫자입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// while ==> 몇번 반복 해야하는지 모르는 경우에 사용
		while (true) {
			System.out.println("숫자입력 : ");
			num = sc.nextInt();
			if (num > 10) {
				break;
			}

		}

		System.out.println("프로그램 종료..");

	}

}
