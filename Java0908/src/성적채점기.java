import java.util.Scanner;

public class 성적채점기 {

	public static void main(String[] args) {
		int[] input = new int[5]; //사용자가 입력한 정답이 들어갈 배열
		int[] answer = {3,5,1,1,2}; // 실제 문제의 정답이 들어간 배열
		int total = 0;
		//1. 사용자에게 정답을 입력받는 구간
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
	
		Scanner sc = new Scanner(System.in);
		
		
//===============================================================================
		//첫번째 for문
		for(int i = 1; i<=5; i++ ) 
		{
			System.out.print(i + "번답 >>");
			
			// input[0] , input[1] , input[2] .... input[4]까지 입력값을 넣을꺼에요
			int n = sc.nextInt(); //여기!
			// 여기서 int n에 할당시  n에 5번 입력값을 할당하는 코드라 최종 입력값만 n에 저장되요
			//for문의 i변수를 이용해서 배열에 할당하시면 됩니다^^
		}
		System.out.println("정답확인");
		
		
		//2. 입력받는 값과 실제 정답을 비교하는 구간
		
		//+==========================================================================
		
		//2번째 for문
		//5의 크기인 배열이라 변수가 5개와 같아요  => 즉 5번 비교
		for(int s=0; s <= 4 ; s++ )
		{   // 0 >= 5이란 조건이 flase  (0은 5보다 작다) -> 즉 false로서 for문 탈출 //여기!
			//현재 for문 안에서 선언된 변수  지역변수 s 
			//전역변수 : 배열 input[] , answer[]
			
			//방금 오류난 이유가 input[5]라는 변수가 없어서 그래요 > 즉 여기에 z라는 변수가 없는 데 값을 비교하는 것과 같습니다
			//조건식만 수정하면 되요 input[0]~input[4]까지만 비교되도록
			
			//여기 오류는 s 초기 값이 정해져 있지 않아서 비교를
			// 하지 못해서 오류가 나는 거에요!
			
			if( input[s] == answer[s])
			{ //이제 배열 input[] 과 answer[]을 비교해주세요 // 여기! //1번
			
			//정수를 비교할때는 == 이 기호를 사용해주시면 됩니다!
				System.out.print("O");
				//힌트 출력
				System.out.println("입력값 : "+input[s] +" == "+ answer[s]);
				total +=20;
			}
			else
			{//괄호 하나 없어서 else 문에서 오류났었어요~ //여기
				System.out.print("X");
				System.out.println("입력값 : "+input[s] +" == "+ answer[s]);
			}
		
		System.out.println();
		
		}
		System.out.println("총점확인 : " + total);
		//3. 전체 총점을 출력하는 구간
		
		//총점은 변수하나를 선언해서  1번 수정부분이 참일때 20씩 증가하면 되요
		//(꼭 20씩 증가하는 방법이 아니여두 됩니다^^)
		//총점 변수는 순서가 중요해요!
	
		//그 다음 총점 출력문 작성
		

	}
}



