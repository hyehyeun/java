package ex02;

public class Triangle extends Figure{
	// (�غ� x ����) /2
	private double base;
	private double height;
	private static String name = "�ﰢ��";
	
	//������
	public Triangle(double base,double height) {
		this.base = base;
		this.height = height;
	}
	// ���� ��� �޼ҵ�
	// �޼ҵ� �������̵� : ������
	public double calAtra() {
		return base * height / 2;
	}
	public static String getName() { //���뺯�� �� ���� ! static �����
		return name;
	}
	

}
