
public class SngKar implements KartRider,KartRider2 {
	// 클래스를 상속받을때는 extends
	// 인터페이스를 구현할때는 implements
	
	int sngKarPosition = postition;
    
	@Override // 어노테이션
	public void go(int num) {
		sngKarPosition += num;

	}

	@Override
	public void back(int num) {
		sngKarPosition -= num;

	}

	@Override
	public void buster(int num) {
		sngKarPosition *= num;

	}
	public void parking() {
		System.out.println("주차");
	}

}
