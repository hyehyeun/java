import java.util.Scanner;

public class 조건문06_1 {

	public static void main(String[] args) {
		
		//컴퓨터야 너가 점수를 입력하세요 라고 말한다면
		//점수를 입력할테니 너는 grade라는 변수에 담아줘
		//grade가 90이상이면 'A학점 입니다' 를 출력하고
		//grade가 90점 미만 80이상이면 'B학점 입니다' 를 출력하고
		//grade가 80점 미만 70이상이면 'C학점 입니다' 를 출력하고

		
		System.out.println("점수를 입력하세요>>");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		if(grade>=90){
			System.out.println("A학점입니다.");
		}
		else if(grade>=80 && grade<90){
			System.out.println("B학점입니다.");
		}
		else if(grade>=70 && grade<80){
			System.out.println("C학점입니다.");
		}
		
		if(grade>=60) {
			System.out.println("D");
		}
		if(grade>=50) {
			System.out.println("휴학ㄱ");
	}
	}

}
