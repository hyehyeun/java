
public class �޼ҵ���� {
	
	//main �޼ҵ� ���α׷��� ������(���� ��ų �� �ִ� ����)
	public static void main(String[] args) {
		// �޼ҵ� ȣ��(����)
		addNumber(100,900);
		
		// �޼ҵ� ȣ��
		subThreeNumber(3.5f, 1.2f, 0.4f);
		
		System.out.println("Main ��");
	}
	// 1��° �޼ҵ� ����
	// addNumber �޼ҵ�										�� ��ȣ�ȿ� ���� �־������
	// �޼ҵ� ����						//�ܺο��� �� ���ȡ� (���� addNumber();�� �ٲ������
	public static void addNumber(int num1,int num2) {
				
		int result = num1 + num2;
		
		System.out.println(result);
					
	}
	// 2��° �޼ҵ� ����
	// subNumber �޼ҵ� : 3���� �Ǽ��� �Է¹޾Ƽ� ����
	
	public static void subThreeNumber(float n1, float n2, float n3) {
		float result = n1 - n2 - n3;
		
		System.out.println(result);
	}

}
