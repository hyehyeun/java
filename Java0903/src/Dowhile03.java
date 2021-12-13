import java.util.Random;
import java.util.Scanner;

public class Dowhile03 {

	public static void main(String[] args) {
		// 랜덤으로 정수2개를 뽑아 아래와 같이 출력
		// 사용자는 두 수의 합을 입력
		// 두 수의 합과 입력한 수가 일치하면 "Success"
		// 두 수의 합과 입력한 수가 일치하지 않으면 않으면 "Fail"
		// 1~100 사이의 난수 2개를 뽑아 덧셈을 하는 게임을 만들어보자.
		

		// 난수뽑기

		// Random random = new Random();
		// int num = random.nextInt(20)+1;
		// 0~19까지 난수 발생 ↑범위
		
		System.out.println("==Plus Game==");
		Scanner sc = new Scanner(System.in);
		

		Random random = new Random();
		int num1 = random.nextInt(100)+1;      //0~99
		int num2 = random.nextInt(100)+1;
		System.out.print(num1+"+"+num2+"=");

		int num3 = sc.nextInt();
		

		if (num1+num2 == num3) {
			System.out.println("Success");
		}
		
		else {
			System.out.println("Fail");
		}

	}

}
