
public class 반복문예제2 {

	public static void main(String[] args) {
		//1~20까지 숫자를 출력해보자.
		// 홀수는 양수로 출력하고, 짝수는 음수로 출력 해봅시다.
		// 1 -2 3 -4 5 -6 7 -8..... 19 -20
		
		// 짝수 : 2 4 6 8 -> 2의 배수 -> 2로 나눴을때 나머지가  0        i%2=0
		// 홀수 : 1 3 5 7 -> 2로 나눴을때 나머지가 1
		
//		for(int i = 1;i<=20; i++) {
//			if(i%2==0) {  //짝수
//			System.out.print(-i +" ");
//		}else {  //홀수
//			System.out.print(i+" ");
//		}
//		
//		
//		}  
                                 //even이 20이 될 때까지           //2씩 증가 		
		for (int even=2, odd=1; even<=20 ; even+=2,odd+=2) {
			System.out.print(odd + " " +-even + " ");
		}

	}

	}
