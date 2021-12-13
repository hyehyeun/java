import java.util.Scanner;

public class 회원관리시스템 {

	public static void main(String[] args) {
		// 1.회원가입 2.로그인 3.종료
		System.out.println("==== 회원관리 시스템 ====");
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.회원가입 2.로그인  3.종료");

			int choice = sc.nextInt();

			if (choice == 1) { // 회원가입
				System.out.println("==== 회원가입 ====");
			} else if (choice == 2) { // 로그인
				System.out.println("=== 로그인  ===");
			} else if (choice == 3) { // 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else
				System.out.println("번호를 올바르게 입력하세요!!");
		}
	}

}
