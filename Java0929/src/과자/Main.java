package 과자;

public class Main {

	public static void main(String[] args) {
		
		My my = new My();
		
		//바나나 , 썬칩, 양파링 먹기
		바나나킥 banana = new 바나나킥();
		my.eat(banana);
		
		썬칩 sun = new 썬칩();
		my.eat(sun);
		
		양파링 onion = new 양파링();
		my.eat(onion);
		
		Snack snak = onion;
		//다운캐스팅 -  일시적으로 하위클래스에 있는 기능을 사용하고 싶을때
		양파링 oni2 = (양파링)snak;
		oni2.sourc();

	}

}