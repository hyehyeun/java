import java.util.Arrays;

public class 메소드응용 {

	public static void main(String[] args) {
		//1. 약수인지를 알려주는 메소드 
		//메소드 이름 : isDivisor
		//입력인자(매개변수) : 정수2개 (나눔을 당하는 수, 약수인지 알아볼 숫자)
		//반환타입(리턴타입) : 논리(boolean)
		
		// 메소드 호출
		int base = 10, divisor=3;
		boolean result = isDivisor(base,divisor);
		System.out.println(result);
		// 2. 입력된 숫자의 약수들을 알려주는 메소드
		// 메소드 이름 : getDivisors
		// 입력인자(매개변수) : 정수 1개
		// 반환타입(리턴타입) : 정수형 배열
		
		//메소드 호출
		base = 10;
		int[] result_array = getDivisors(base);
		
		//Arrays.toString() : 배열을 0번째부터 끝번째까지 문자열로 만들어줌
		System.out.println(Arrays.toString(result_array));
		
		// 3. 입력된 숫자가 소수인지 알려주는 메소드
		// 메소드 이름 : isPrime
		// 입력인자 : 1보다 큰 정수 1개
		// 반환타입 : boolean
		
		// 메소드 호출
		base = 17;
		boolean result_prime = isPrime(base);
		System.out.println(result_prime);
	}
	
	private static boolean isPrime(int base) {
		// 기존에 작성한 메소드를 활용 : getDivisors
		
		
		return getDivisors(base).length == 2;
		
		
	}

	private static int[] getDivisors(int base) {
		//10의 약수를 구하려면 1부터 10까지 숫자를 올려가면서 나눗셈
		int[] array = new int[base]; // 약수를 담을 배열
		
		int index = 0; // 약수가 들어갈 공간을 알려주는 index
		for(int i = 1; i<=base; i++) {
			if(isDivisor(base,i)) {// 약수 성립
				array[index++] = i;				
			}
		}
		//Arrays.copyOf() : 배열을 원하는 길이까지 복제
		return Arrays.copyOf(array,index);  //불필요한거 빼고 출력
//		return array;  //array 통으로 넘김
	}
	private static boolean isDivisor(int base,int divisor) {
		return base % divisor == 0;
	
}

}
