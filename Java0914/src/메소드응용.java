import java.util.Arrays;

public class �޼ҵ����� {

	public static void main(String[] args) {
		//1. ��������� �˷��ִ� �޼ҵ� 
		//�޼ҵ� �̸� : isDivisor
		//�Է�����(�Ű�����) : ����2�� (������ ���ϴ� ��, ������� �˾ƺ� ����)
		//��ȯŸ��(����Ÿ��) : ��(boolean)
		
		// �޼ҵ� ȣ��
		int base = 10, divisor=3;
		boolean result = isDivisor(base,divisor);
		System.out.println(result);
		// 2. �Էµ� ������ ������� �˷��ִ� �޼ҵ�
		// �޼ҵ� �̸� : getDivisors
		// �Է�����(�Ű�����) : ���� 1��
		// ��ȯŸ��(����Ÿ��) : ������ �迭
		
		//�޼ҵ� ȣ��
		base = 10;
		int[] result_array = getDivisors(base);
		
		//Arrays.toString() : �迭�� 0��°���� ����°���� ���ڿ��� �������
		System.out.println(Arrays.toString(result_array));
		
		// 3. �Էµ� ���ڰ� �Ҽ����� �˷��ִ� �޼ҵ�
		// �޼ҵ� �̸� : isPrime
		// �Է����� : 1���� ū ���� 1��
		// ��ȯŸ�� : boolean
		
		// �޼ҵ� ȣ��
		base = 17;
		boolean result_prime = isPrime(base);
		System.out.println(result_prime);
	}
	
	private static boolean isPrime(int base) {
		// ������ �ۼ��� �޼ҵ带 Ȱ�� : getDivisors
		
		
		return getDivisors(base).length == 2;
		
		
	}

	private static int[] getDivisors(int base) {
		//10�� ����� ���Ϸ��� 1���� 10���� ���ڸ� �÷����鼭 ������
		int[] array = new int[base]; // ����� ���� �迭
		
		int index = 0; // ����� �� ������ �˷��ִ� index
		for(int i = 1; i<=base; i++) {
			if(isDivisor(base,i)) {// ��� ����
				array[index++] = i;				
			}
		}
		//Arrays.copyOf() : �迭�� ���ϴ� ���̱��� ����
		return Arrays.copyOf(array,index);  //���ʿ��Ѱ� ���� ���
//		return array;  //array ������ �ѱ�
	}
	private static boolean isDivisor(int base,int divisor) {
		return base % divisor == 0;
	
}

}
