package upcasting;

public class PhoneMain {

	public static void main(String[] args) {


		Phone phone = new Phone();
		SmartPhone smart = new SmartPhone();
		
		phone.call();
		smart.call();
		
		//��ĳ����
		//�ڽ�Ŭ���� Ÿ���� ��ü�� �θ�Ÿ�� ��ü�� �־���
		//==>�ڵ� ����ȯ
		Phone phone2 = smart;
		//phone2.Wifi();
		phone2.call();
		//�ٿ� ĳ���� : ��ĳ���� �Ȱ��� �ڽ�Ŭ���� Ÿ������ �Ͻ��� ����ȯ
		SmartPhone smart2 = (SmartPhone) phone2;
		smart2.Wifi();

	}

}