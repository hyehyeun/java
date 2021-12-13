import java.util.Scanner;

public class Dowhile02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무계:");
		int nowKg = sc.nextInt();
		
		System.out.print("목표몸무게:");
		int wantKg = sc.nextInt();
		
		int week=1; //몇주차인지 알기위한 변수
		do {
			//살빼는 로직
			
			System.out.println(week+"주차 감량 몸무게:");
			int lossKg = sc.nextInt();
			nowKg = nowKg-lossKg; //현재 몸무게 변경
			
			week++;
			
		} while(nowKg>wantKg);
		
		System.out.println(nowKg+"kg 달성!! 축하합니다!");
		
	}

}
