import java.util.Scanner;

public class 조건문02 {

	public static void main(String[] args) {
		
//		//1. age 라는 변수에 값 입력 다기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력해 주세요>>");
//		int age = sc.nextInt();
//		
//		//2. 만약 age 값이 20보다 크거나 같다면 '성인입니다.' 출력하기
//		if(age >= 20) {
//			System.out.println("성인입니다");
//		}

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : >>");
		int number = sc.nextInt();
			
	    if(number>100) {
				System.out.println("홀수");
		}
		else {
				System.out.println("짝수");
		
		}
	}

}
