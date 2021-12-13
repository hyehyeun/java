import java.util.Scanner;

public class 조건문03 {

	public static void main(String[] args) {

		// 컴퓨터야 내가 숫자 두개를 입력하고 싶으니 너는
		// 'A입력', 'B입력', 이라고 출력을 해준다면
		// 각각 숫자를 넣어줄게 그리고 너는 그 숫자를 A-B 로 출력해준면돼
		// 위의 과정을 계속해서 반복하되
		// 그런데 내가 만약 A와 B에 0, 0을 입력했다면 -> 프로그램 종료시켜줘

		Scanner sc = new Scanner(System.in);

		// while ==> 몇번 반복 해야하는지 모르는 경우에 사용
		
		

		while (true) {
			System.out.print("A 입력 >> ");
			int numA = sc.nextInt();

			System.out.print("B 입력 >>");
			int numB = sc.nextInt();

			System.out.println("결과>>" + (numA - numB));

			if (numA == 0 && numB == 0) {
				break;
			}

		}
		System.out.println("프로그램 종료");
	}
}
