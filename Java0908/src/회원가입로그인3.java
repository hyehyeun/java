import java.util.Scanner;

public class 회원가입로그인3 {

	public static void main(String[] args) {
		// 1.회원가입 2.로그인 3.종료
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 회원관리 시스템 ====");
		String[] id_array = { "", "", "" }; // 배열 선언할때 이렇게 값을 바로 넣어준다면 new String 이라는 키워드는 안적어도 됩니다!
		String[] pw_array = { "", "", "" };
		int i = 0;

		while (true) {
			System.out.println("1.회원가입 2.로그인  3.종료");
			int choice = sc.nextInt();
			System.out.println();

			if (choice == 1) { // 회원가입
				System.out.println("==== 회원가입 ====");
				System.out.print("id 입력 : ");
				id_array[i] = sc.next();

				System.out.print("pw 입력 : ");
				pw_array[i] = sc.next();
				i++;
				System.out.println("가입 성공");

			} else if (choice == 2) { // 로그인
				System.out.println("=== 로그인  ===");
				// id와 pw를 입력받고 그값이 id_array와 pw_array에 있다면
				// '로그인 성공'을 출력하고, 아니라면 '로그인 실패' 출력하세요
				System.out.print("id>>");
				String input_id = sc.next();

				System.out.print("pw>>");
				String input_pw = sc.next();
				int count = 0;
				for (int j = 0; j < id_array.length; j++) {
					if (id_array[j].equals(input_id) && pw_array[j].equals(input_pw)) {

						System.out.println("로그인 성공");
						count++;
					}

				}
				if (count == 0) {
					System.out.println("로그인 실패");
				}

			} else if (choice == 3) { // 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else
				System.out.println("번호를 올바르게 입력하세요!!");
		}

	}

}
