
public class �ú��ʺ�ȯ�޼ҵ� {

	public static void main(String[] args) {
		// �޼ҵ� �̸� secondToHMS
		// �Է� : ����Ÿ�� => �� ����
		// ��ȯ : ���ڿ�Ÿ�� => 0�� 0�� 0��
		// test case : 60 => 0�� 1�� 0��
		// : 185 => 0�� 3�� 5��
		// : 3600 => 1�� 0�� 0��


		// 2. �޼ҵ� ȣ��
		System.out.println(secondToHMS(185));

	}

	// 1. �޼ҵ� ����
	public static String secondToHMS(int sencond) {
		
		int H = sencond/3600;
	    int M = sencond%3600/60;
	    int S = sencond%60;
	    
	    String result = H+"�� "+M+"�� "+S+"�� ";
	    
		return result;
	}

}
