package 상속기초;

public class 상속Main {

	public static void main(String[] args) {
		휠마우스 h = new 휠마우스();
		h.우클릭();
		h.좌클릭();
		//h.드래그(); //메소드의 접근제한자가 private이면 상속이 불가능하다.

	}

}
