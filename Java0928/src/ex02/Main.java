package ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 도형 넓이 계산 프로그램
		// 1. 객체지향을 적용해서 설계
		// 2. 상속 개념을 적용
		// 3. 다형성을 이용해서 확장이 쉬운 프로그램으로 설계
		
		System.out.println("*****도형 넓이 계산기*****");
		Scanner sc =new Scanner(System.in);
		
		while(true) {
		System.out.print("[1] 삼각형 [2] 사각형 [3] 종료>>" );
		int choice = sc.nextInt();
		
		if(choice == 1) {
			// 1. 데이터 입력
			System.out.print(Triangle.getName() +"의 밑변>>");
			double base = sc.nextDouble();
			System.out.print(Triangle.getName() +"의 높이>>");
			double height = sc.nextDouble();			
			// 2. 삼각형 객체 생성
			Triangle t = new Triangle(base,height);
			// 3. 삼각형의 넓이 계산 후 출력
			System.out.println(Triangle.getName() +"의 넓이 : " +t.calAtra());
			
		}else if(choice == 2) {
			// 1. 데이터 입력
			System.out.print(Renctangle.getName()+"의 밑변>>");
			double width = sc.nextDouble();
			System.out.print(Renctangle.getName()+"의 높이>>");
			double height = sc.nextDouble();
			// 2. 사각형 객체 생성
			Renctangle r = new Renctangle(width,height);
			// 3. 사각형의 넓이 계산 후 출력
			System.out.println(Renctangle.getName()+"의 넓이 :" + r.calArea());
		}else if(choice ==3) {
			break;
		}
		
	}
}
}

