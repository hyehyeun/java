//�Դ�Ÿ� ���� TV�� �����غ���!!
// class(���赵)
public class TV {
	// �ʵ�(Data)
	String color; // tv ����
	double inch; // tv ȭ��ũ��
	int channel; // tv�� ���� ä��
	int volum; // tv�� ����
	String brandName; //�귣���(������)
	boolean isTurnOn; //��������
	boolean isLED; //True => LED, False => OLED
	String resolution; //�ػ�		
	// �޼ҵ�(Logic)
	public void turnOnOFF() {
		isTurnOn = !isTurnOn;
	}
	public void changeCH(int ch) {
		channel = ch;
	}

}
