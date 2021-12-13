import java.util.Scanner;

public class 조건문09 {

	public static void main(String[] args) {
//if(menu==?)

		System.out.println("금액을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int Money = sc.nextInt(); // Money => 사용자가 넣은 금액
		System.out.println("메뉴를 고르세요");
		System.out.println("1. 콜라(800원) 2.생수(500원) 3. 비타민원터(1500원)");
		int menu = sc.nextInt(); // --> 사용자가 어떤거를 입력했는지?

		int coka = 800;
		int water = 700;
		int bitawater = 2000;

		// 사용자가 선택한 메뉴에 따라 money의 값 변경-->잔돈
		// 만약 사용자가 입력한 금액이 제품의 값보다 작다면
		// '금액이부족합니다.' -> 계산x, 사용자가 입력한 금액이 출력

		if (menu == 1) {
			if (Money < coka) {
				System.out.println("금액이 부족합니다");
			} else {
				Money = Money - coka;
			}

		}

		else if (menu == 2) {
			if (Money < water) {
				System.out.println("금액이 부족합니다");
			}

			else {
				Money = Money - water;
			}
		} else if (menu == 3) {
			if (Money < bitawater) {
				System.out.println("돈이 부족해요ㅠㅠ");
			} else {
				Money = Money - 1500;
			}
		}

		System.out.println("잔돈 : " + Money + "원");
	
		//천원짜리 잔돈 갯수 구하기
      //  System.out.println("천원 : " + Money/1000);
        
        int 천원 = Money/1000;
        int 오백원 = Money%1000/500;
        int 백원 = Money%1000%500/100;
        		
        System.out.println(" 1000원 : " + 천원 +" 500원 :" + 오백원 + " 100원 :" +백원);
		

        
        
        
        
	}
}