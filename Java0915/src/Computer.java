
public class Computer {
// 필드(Data)
	String color; ="rad"// Computer 색상
	double inch; // Computer 화면크기
	int channel; // Computer의 현재 채널
	int volum; // Computer의 음량
	String brandName; // 브랜드명(제조사)
	boolean isTurnOn; // 전원상태
	boolean isLED; // True => LED, False => OLED
	String resolution; // 해상도
	
	// 메소드(Logic)
		public void colorChange(String c) {
			color = c;
		}
}
