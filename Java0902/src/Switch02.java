import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		System.out.println("점수를 입력 해주세요>> ");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		//100~90 십의자리 : 10 or 9
		//89~80 십의자리 : 8
		//79~70 십의자리 :7
		
		switch(grade/10) { //비교 대상이 될값! case 비교할값:
		//ctrl + alt + 방향키
		case  10:
		case  9:
			System.out.println("A학점 입니다!");
			break;
		case 8  :
			System.out.println("B학점 입니다!"); 
			break;
		case 7   :
			System.out.println("C학점 입니다!");
			break;
		default :
			System.out.println("휴학ㄱ");
			break;
	}
	}

}

