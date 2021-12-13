package ex02;

public class Renctangle extends Figure {
	// 너비 x 높이
	private double width;
	private double height;
	private static String name = "사각형";
	
	// 생성자
	public Renctangle(double width,double height) {
		this.width = width;
		this.height = height;
	}
	
	// 넓이 계산 메소드
	// 메소드 오버라이딩 : 재정의
	public double calArea() {
		return width * height;
	}
	public static String getName() {
		return name;
	}

}
