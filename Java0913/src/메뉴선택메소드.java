import java.util.Random;

public class 메뉴선택메소드 {

	public static void main(String[] args) {
		// 메뉴선택 메소드 : 선택장애를 위한 음식 선택 메소드
		// 메소드 호출
		String menu_name = selectMenu();
		System.out.println("오늘 먹을 음식은>>"+ menu_name);
		

	}
	// 메소드 정의               인덱스 0 ~ 8
 	public static String selectMenu() {
		String[] name = {"짜장면","돈까스","쫄면","만두",
						"국밥","치킨","피자","크림순대국","모밀"};
		
		Random rd = new Random(); //메뉴 인덱스용 난수 추출
		int index = rd.nextInt(name.length);
		
		return name[index];
		
	}

}
