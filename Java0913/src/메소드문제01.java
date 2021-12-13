import java.util.Scanner;

public class 메소드문제01 {

	public static void main(String[] args) {
		// 키보드로부터 입력받은 두 개의 정수를 인자(매개변수)로 넘겨받아
		// num1에서 num2를 뺀 결과값을 절대값으로 바꾸어 출력하는
		// getAvsoluteValue() 메소드를 구현하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();

		int result = getAvsoluteValue(num1, num2); //메소드 호출!! 
	}

	public static int getAvsoluteValue(int num1, int num2) {
		int result = num1 - num2;
		if(result<0) {
			result=-result;
			System.out.println("결과확인 : " + result);
		}

		return result;

	}

}
