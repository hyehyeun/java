
public class 시분초변환메소드 {

	public static void main(String[] args) {
		// 메소드 이름 secondToHMS
		// 입력 : 정수타입 => 초 단위
		// 반환 : 문자열타입 => 0시 0분 0초
		// test case : 60 => 0시 1분 0초
		// : 185 => 0시 3분 5초
		// : 3600 => 1시 0분 0초


		// 2. 메소드 호출
		System.out.println(secondToHMS(185));

	}

	// 1. 메소드 정의
	public static String secondToHMS(int sencond) {
		
		int H = sencond/3600;
	    int M = sencond%3600/60;
	    int S = sencond%60;
	    
	    String result = H+"시 "+M+"분 "+S+"초 ";
	    
		return result;
	}

}
