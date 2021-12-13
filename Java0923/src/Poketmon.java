
public class Poketmon {
	
	private String name; //포켓몬 이름
	private String type; //포켓몬 타입
	private int attack; //공격력
	private int shield; //방어력
	private int hp;// 체력
	//오박사님 원하는 설정값으로 바로 포켓몬을 만들 수 있게함
	public Poketmon(String name, String type, int attack, int shield, int hp) {
		super();
		this.name = name;
		this.type = type;
		this.attack = attack;
		this.shield = shield;
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getShield() {
		return shield;
	}
	public void setShield(int shield) {
		this.shield = shield;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	

}
