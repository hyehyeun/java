
public class SngKar implements KartRider,KartRider2 {
	// Ŭ������ ��ӹ������� extends
	// �������̽��� �����Ҷ��� implements
	
	int sngKarPosition = postition;
    
	@Override // ������̼�
	public void go(int num) {
		sngKarPosition += num;

	}

	@Override
	public void back(int num) {
		sngKarPosition -= num;

	}

	@Override
	public void buster(int num) {
		sngKarPosition *= num;

	}
	public void parking() {
		System.out.println("����");
	}

}
