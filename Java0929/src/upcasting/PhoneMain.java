package upcasting;

public class PhoneMain {

	public static void main(String[] args) {


		Phone phone = new Phone();
		SmartPhone smart = new SmartPhone();
		
		phone.call();
		smart.call();
		
		//업캐스팅
		//자식클래스 타입의 객체를 부모타입 객체로 넣어줌
		//==>자동 형변환
		Phone phone2 = smart;
		//phone2.Wifi();
		phone2.call();
		//다운 캐스팅 : 업캐스팅 된것을 자식클래스 타입으로 일시적 형변환
		SmartPhone smart2 = (SmartPhone) phone2;
		smart2.Wifi();

	}

}