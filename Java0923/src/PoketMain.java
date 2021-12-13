import java.util.ArrayList;

public class PoketMain {

	public static void main(String[] args) {
		
		//포켓몬 수는 정확히 알 수 없다.
		//포켓몬 돔감에 몇마리가 들어가야하는지 알 수 없다.
		
		ArrayList<Poketmon> poktList = new ArrayList<Poketmon>();
		Poketmon pika = new Poketmon("피카츄","번개", 80,60,70);
		Poketmon piri = new Poketmon("파이리","불", 90,40,50);
		
		//포켓몬도감 추가
		poktList.add(pika);
		poktList.add(piri);
		
		
		System.out.println("피카츄 공격력 : "+poktList.get(0).getAttack());
		
		//포켓몬 도감 만들기 5마리
		
	

	}

}
