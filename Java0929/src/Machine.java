
public class Machine {

	// 각각의 인형을 뽑는기능 만들기
//	public void run(Pika pika) {
//		pika.get();
//	}
//	public void run(Piri piri) {
//		piri.get();
//	}
//	public void run(Kkobuk kkobuk) {
//		kkobuk.get();
//	}

	// 하위클래스 포괄할 수 있는 메소드 생성 -> 업캐스팅
	// 하위 클래스 -> 상위 클래스로!
	public void run(Doll doll) {
		doll.get();
	}
}

// 오버로딩 중복정의
// 오버라이딩 재정의