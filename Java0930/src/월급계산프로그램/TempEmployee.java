package ���ް�����α׷�;

public class TempEmployee {

	String empno;// ���
	String name; // �̸�
	int pay; // ����

	public TempEmployee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	// ���޿� ��� �޼ҵ�
	public int getMaoneyPay() {
		return pay/12;
	}

	// ���:�̸�:���� ���
	public void ptint() {
		System.out.println(this.empno + " : " + this.name + " : " + this.pay);

	}
}
