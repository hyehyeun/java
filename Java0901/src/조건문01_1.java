import java.util.Scanner;

public class 조건문01_1 {

	public static void main(String[] args) {
		
		//가위바위보 
		//1. 가위, 바위, 보 Scanner를 통해서 
		//String 변수인 user라는 변수에 담아주세요!
		
		System.out.print("가위바위보 입력>>");
		Scanner sc = new Scanner(System.in);
		String user = sc.next();
		
		String cmp = "가위";
		
		if(user.equals("주먹")) {// 만약 사용자가 가위를 입력했다면 '승리!' 라고 출력!
		    System.out.println("승리!");
		}
		//System.out.println("user : "+user);

	}

	}
