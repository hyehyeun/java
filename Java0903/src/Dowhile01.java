import java.util.Scanner;

public class Dowhile01 {

	public static void main(String[] args) {

        //좋아하는 숫자 5번 반복해서 출력
		
 		int num=4;
//		while(num<=5) {
//			System.out.println("6");
//			num++;
//		}
 		
//		do {
//			System.out.println("6");
//			num++;
//			
//		}while(num<=5);
 		Scanner sc = new Scanner(System.in);
 		
 		System.out.print("현재몸무게 : ");
 		int numA = sc.nextInt();
 		
 		System.out.print("목표몸무게 : ");
 		int numB = sc.nextInt();
	
 		do  {
 			System.out.print("1주차 감량 몸무게 : " + (num));
 			System.out.print("2주차 감량 몸무게 : " + (num));
 			System.out.print("3주차 감량 몸무게 : " + (num));
 			System.out.print("4주차 감량 몸무게 : " + (num));			
 			
 		 num++;
 		 
 		} while(num+1<=5);
 		
 		System.out.println("66kg 달성!! 축하드립니다!");
 			
 		}
 		
 		

	}

