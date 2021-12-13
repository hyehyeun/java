
public class 메소드기초 {
	
	//main 메소드 프로그램의 시작점(실행 시킬 수 있는 지점)
	public static void main(String[] args) {
		// 메소드 호출(실행)
		addNumber(100,900);
		
		// 메소드 호출
		subThreeNumber(3.5f, 1.2f, 0.4f);
		
		System.out.println("Main 끝");
	}
	// 1번째 메소드 정의
	// addNumber 메소드										위 괄호안에 숫자 넣어줘야함
	// 메소드 정의						//외부에서 값 들어옴↓ (위에 addNumber();도 바꿔줘야함
	public static void addNumber(int num1,int num2) {
				
		int result = num1 + num2;
		
		System.out.println(result);
					
	}
	// 2번째 메소드 정의
	// subNumber 메소드 : 3개의 실수를 입력받아서 뺄셈
	
	public static void subThreeNumber(float n1, float n2, float n3) {
		float result = n1 - n2 - n3;
		
		System.out.println(result);
	}

}
