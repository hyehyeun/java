import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		System.out.println("======인형뽑기======");
		Scanner sc = new Scanner(System.in);

		// 기계를 통해 각각의 인형을 뽑아주세요!!
		Machine m = new Machine();
		
		//피카츄인형 뽑고싶은
		Pika pika = new Pika();
		m.run(pika);
		pika.get2();
		//꼬북이 인형도 뽑고싶음
		Kkobuk kkobuk = new Kkobuk();
		m.run(kkobuk);
		//파이리 인형도 뽑고싶음
		Piri piri = new Piri();
		m.run(piri);
		
		//추상클래스는 몸체(구현)이 없기 때문에 객체가 생성이 불가능 하다!!!
		//임시적으로는 생성 가능하지만 거의 사용하지 않는다!!!
		//추상클래스라는 것은 하위클래스에서 구현할 부분을 정의해놓을거이기 때문에
		Doll doll = new Doll() {
		
		
		@Override
		public void get() {
			
		}
	};
	Doll doll2 = new Pika();
}
		
//		while(true) {
//			System.out.print("[1]피카츄 [2]파이리[3]꼬북이");
//			int choice = sc.nextInt();
//			
//			if(choice == 1) {
//				System.out.println(Pika.class);
//				
//			}else if(choice ==2) {
//				System.out.println(Piri.class);
//			}else if(choice ==3) {
//				System.out.println(Kkobuk.class);
//			}
//			
//		}
//		
			
		}

	


