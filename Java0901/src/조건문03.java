import java.util.Scanner;

public class 조건문03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int number = sc.nextInt();
		// 수학에서의 비교 =
		//java 에서의 비교 == , !=
		if(number%2 ==0) {
			System.out.println(number+"은 짝수 입니다");
		}
		else {
			System.out.println(number+"은 홀수 입니다.");
		}
	}

}
