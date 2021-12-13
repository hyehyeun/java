import java.util.Arrays;

public class Numbers {
	// 접근제한자 : 기능에 접근할 수 있는 범위를 설정하는 키워드
	// private : 메소드가 정의된 파일 안에서만 사용가능
	// public : 외부 파일에서 사용가능
	
	
	public static boolean isPrime(int base) {
		// 기존에 작성한 메소드를 활용 : getDivisors
		
		
		return getDivisors(base).length == 2;
		
		
	}

	public static int[] getDivisors(int base) {
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
	public static boolean isDivisor(int base,int divisor) {
		return base % divisor == 0;
}
}