
public class Poketmon {
	
	private String name; //���ϸ� �̸�
	private String type; //���ϸ� Ÿ��
	private int attack; //���ݷ�
	private int shield; //����
	private int hp;// ü��
	//���ڻ�� ���ϴ� ���������� �ٷ� ���ϸ��� ���� �� �ְ���
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
