package ���ް�����α׷�;

public class RegualEmployee {
	
	String empno;//���
	String name; //�̸�
	int pay; //����
	int bonus; //���ʽ�
	public RegualEmployee(String empno, String name, int pay, int bonus) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}
	//���޿� ��� �޼ҵ�
	public int getMaoneyPay() {
		return(pay+bonus)/12;
	}
	//���:�̸�:���� ���
	public void print() {
		System.out.println(this.empno+" : " + this.name+ " : "+this.pay);
		
	}
	

}
