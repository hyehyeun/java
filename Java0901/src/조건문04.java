import java.util.Scanner;

public class 조건문04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >>");
		int number = sc.nextInt();
		
		int oneJali = number%10;
		
		if(oneJali>=5) {
			number = (number-oneJali)+10;
		}
		else {
			number = number-oneJali;
		}
		System.out.println("반올림수 : "+number);
		

	}

}
