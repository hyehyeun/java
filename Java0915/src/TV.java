//게더타운에 들어가는 TV를 설계해보자!!
// class(설계도)
public class TV {
	// 필드(Data)
	String color; // tv 색상
	double inch; // tv 화면크기
	int channel; // tv의 현재 채널
	int volum; // tv의 음량
	String brandName; //브랜드명(제조사)
	boolean isTurnOn; //전원상태
	boolean isLED; //True => LED, False => OLED
	String resolution; //해상도		
	// 메소드(Logic)
	public void turnOnOFF() {
		isTurnOn = !isTurnOn;
	}
	public void changeCH(int ch) {
		channel = ch;
	}

}
