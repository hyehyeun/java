
public class �޼ҵ����2 {

	public static void main(String[] args) {
		// ���� �� ���� �Է��ϸ� 10�� �ڸ� ���ϴ� �����ϴ� �޼ҵ�
		// 444 -> 400
		// 111 -> 100
		int rs1 = kill10(444);     //�Ʒ� return result ���� �ͼ� 400�̶� �����ص���
		int rs2 = kill10(111);					//return ���۵Ȱ����� �ǵ��ƿ�
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
	}
				  //�� ��ȯŸ��(����Ÿ��)�� �Է�����(�Ű�����)
	//public static void kill10(int num) {
	
	//�޼ҵ� ����
	public static int kill10(int num) {
		int result = (num / 100) * 100;
		
		return result;
		
		
		
	}

}
