
public class Computer {
// �ʵ�(Data)
	String color; ="rad"// Computer ����
	double inch; // Computer ȭ��ũ��
	int channel; // Computer�� ���� ä��
	int volum; // Computer�� ����
	String brandName; // �귣���(������)
	boolean isTurnOn; // ��������
	boolean isLED; // True => LED, False => OLED
	String resolution; // �ػ�
	
	// �޼ҵ�(Logic)
		public void colorChange(String c) {
			color = c;
		}
}
