package ex02;

public class Triangle extends Figure{
	// (밑변 x 높이) /2
	private double base;
	private double height;
	private static String name = "삼각형";
	
	//생성자
	public Triangle(double base,double height) {
		this.base = base;
		this.height = height;
	}
	// 넓이 계산 메소드
	// 메소드 오버라이딩 : 재정의
	public double calAtra() {
		return base * height / 2;
	}
	public static String getName() { //공용변수 쓸 때는 ! static 써야함
		return name;
	}
	

}
