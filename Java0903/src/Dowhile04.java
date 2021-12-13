import java.util.Random;
import java.util.Scanner;

public class Dowhile04 {

	public static void main(String[] args) {

		// 1~100 사이의 난수 2개를 뽑아 덧셈을 하는 게임을 만들어라.
		// 사용자 선택에 따라서 덧셈 게임 또는 뺄셈 게임이 되도록 하자.

		System.out.println("==Plus Game==");
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		String yesOrNo;

		do {
			System.out.println("1[덧셈] 2.[뺄셈] >> ");

			int choice = sc.nextInt();

			int num1 = random.nextInt(100) + 1; // 0~99
			int num2 = random.nextInt(100) + 1;

			if (choice == 1)
				System.out.println(num1 + "+" + num2 + "=");

			else if (choice == 2)
				System.out.println(num1 + "-" + num2 + "=");

			int num3 = sc.nextInt(); // 정수 입력

			if (choice == 1)
				if (num1 + num2 == num3) {
					System.out.println("Success");
				} else {
					System.out.println("Fail");
				}

			else if (choice == 2) {
				if (num1 + num2 == num3) {
					System.out.println("Success");
				} else {
					System.out.println("Fail");
				}
			}

			System.out.print("계속 하시겠습니까?(Y/N) : ");
			yesOrNo = sc.next();

		} 
		while (yesOrNo.equals("Y") || yesOrNo.equals("y"))
			;

	}

}
