package 상속기초2;

public class 태블릿 extends 전화{
	// 메소드 오버라이딩(재정의)
	// 1. 상속관계에서 슈퍼클래스에서 물려받은 메소드를 서브클래스에서 바꾸는 것
	// 2/ 메소드 구조(이름,반환타입,매개변수)는 동일하고 알고리즘만 변경
	public void 전화걸기() {System.out.println("화상통화 걸기");};
	public void 그림그리기() {System.out.println("그림그리기");};

}
