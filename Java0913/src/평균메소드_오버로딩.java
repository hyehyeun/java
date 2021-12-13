
public class 평균메소드_오버로딩 {

	public static void main(String[] args) {
		// 메소드 호출
		double rs = mean(60.5,75.3,78.5);
		
		
		// 결과 출력(syso)
		System.out.println(rs);
		
	}
	//메소드 정의 : kor, eng, math (mean이 어떻게 동작하는지 정의하는 것)
	public static double mean(int kor, int eng, int math) {
		double result = (kor + eng + math) /(double) 3;
						                     //↑강제 형 변환(앞뒤 사용가능)
											// 10/3.0 으로됨 
		
		return result; 
	}
	// 메소드 중복정의 : 같은 이름의 메소드를 정의하는 것
	// 매개변수의 데이터 타입이나 갯수가 다르게 작성해야 성립
	public static double mean(int kor, int eng, int math, int java) {
		double result = (kor+eng+math+java)/4.0;
		return result;
	}
	// 각 과목 실수
	public static double mean(double kor, double eng, double math) {
		double result = (kor+eng+math)/3.0;
		return result;
	}
}
