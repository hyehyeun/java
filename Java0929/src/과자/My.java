package 과자;

public class My {
	
	public void eat(바나나킥 banana) {
		banana.open();
	}
	public void eat(썬칩 sun) {
		sun.open();
	}
	public void eat(양파링 onion) {
		onion.open();
	}
	
	//하위의 클래스 객체를 한번에 다룰수 있게!
	//-> 업캐스팅 오버라이딩 된 기능을 한번에 다룰수있다!
	//상위 클래스에 있는 필드와, 메소드만 사용가능하다!!
	public void eat(Snack snak) {
		snak.open();
	
	//잠깐 소스를 찍어 먹고 싶음
	양파링 onion = (양파링)snak;
	onion.sourc();
		
	}

}