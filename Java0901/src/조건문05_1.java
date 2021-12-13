import java.util.Scanner;

public class 조건문05_1 {

	public static void main(String[] args) {
		//식사시간 1~2시까지
		// 식사시간(정수) 을 입력 받아서 (분 입력X) --> 1 이라는 숫자를 입력했을때만
		// 1~2 사이라면 '식사 시간입니다'를 출력
		// '열공, 빡공, 화이팅!' 을 출력하는 프로그램을 만들어 주세요!
		
		
		//컴퓨터야 몇시라고 너가 물어본다면 나는 시간을 입력해줄게
		//그럼 너는 그 시간을 time 이라는 변수에 담아줘
		//그리고 time 에 있는값은 1~<2tkdlfkaus '식사 시간입니다' 를 출력하고,
		//아니라면 '열공,빡공,화이팅!'
		
		System.out.print("몇시??");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		
		if(time>=1 && time<2) {
			System.out.println("식사시간 입니다");
		}
		else {
			System.out.println("열공, 빡공, 화이팅!");
		}
	}

}
