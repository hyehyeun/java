package ����;

public class My {
	
	public void eat(�ٳ���ű banana) {
		banana.open();
	}
	public void eat(��Ĩ sun) {
		sun.open();
	}
	public void eat(���ĸ� onion) {
		onion.open();
	}
	
	//������ Ŭ���� ��ü�� �ѹ��� �ٷ�� �ְ�!
	//-> ��ĳ���� �������̵� �� ����� �ѹ��� �ٷ���ִ�!
	//���� Ŭ������ �ִ� �ʵ��, �޼ҵ常 ��밡���ϴ�!!
	public void eat(Snack snak) {
		snak.open();
	
	//��� �ҽ��� ��� �԰� ����
	���ĸ� onion = (���ĸ�)snak;
	onion.sourc();
		
	}

}