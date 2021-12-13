
public class 메소드기초2 {

	public static void main(String[] args) {
		// 정수 한 개를 입력하면 10의 자리 이하는 제거하는 메소드
		// 444 -> 400
		// 111 -> 100
		int rs1 = kill10(444);     //아래 return result 값이 와서 400이라 생각해도됨
		int rs2 = kill10(111);					//return 시작된곳으로 되돌아옴
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
	}
				  //↓ 반환타입(리턴타입)↓ 입력인자(매개변수)
	//public static void kill10(int num) {
	
	//메소드 정의
	public static int kill10(int num) {
		int result = (num / 100) * 100;
		
		return result;
		
		
		
	}

}
