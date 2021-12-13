import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		
		
		//월을 입력받아 봄,여름,가을,겨울 중 맞는 계절을 출력
		//겨울 = 12,1,2
		//봄 = 3,4,5
		//여름 = 6,7,8
		//가을 = 9,10,11
		
		System.out.println("월을 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
		//ctrl + alt + 방향키
		case 12:
			System.out.println("겨울");
			break;
		case 1:
			System.out.println("겨울");
			break;
		case 2:
			System.out.println("겨울");
			break;
		case 3:
			System.out.println("봄");
			break;
		case 4:
			System.out.println("봄");
			break;
		case 5:
			System.out.println("봄");
			break;
		case 6:
			System.out.println("여름");
			break;
		case 7:
			System.out.println("여름");
			break;
		case 8:
			System.out.println("여름");
			break;
		case 9:
			System.out.println("가을");
			break;
		case 10:
			System.out.println("가을");
			break;
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("1~12사이의 숫자를 입력해 주세요!");
			break;
			
			
			
			
		}

	}

}
