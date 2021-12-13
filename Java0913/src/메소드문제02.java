
public class 메소드문제02 {

	public static void main(String[] args) {
		// 2개의 정수를 받아 2개의 숫자 중 10에 더 가까운 수를
		// 반환하는 메소드 close10을 만들어보세요
		// (만약 두 숫자 모두 10과의 차이가 같다면 0을 반환)

		int num1 = 11;
		int num2 = 5;
		System.out.println("더 가까운 수 : " + close10( num1, num2));

	}

	public static int close10(int num1, int num2) {

		int resultNum1 = 10 - num1;
		int resultNum2 = 10 - num2;
		
		if (resultNum1 < 0) {
			resultNum1 = -resultNum1;
		}
		if (resultNum2 < 0) {
			resultNum2 = -resultNum2;
		}
		if (resultNum1 > resultNum1) {
			return num2;
		} else if (resultNum2 > resultNum1) {
			return num1;
		} else {
			return 0;
		
		
		}
		}
	}
