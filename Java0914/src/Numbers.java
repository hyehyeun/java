import java.util.Arrays;

public class Numbers {
	// ���������� : ��ɿ� ������ �� �ִ� ������ �����ϴ� Ű����
	// private : �޼ҵ尡 ���ǵ� ���� �ȿ����� ��밡��
	// public : �ܺ� ���Ͽ��� ��밡��
	
	
	public static boolean isPrime(int base) {
		// ������ �ۼ��� �޼ҵ带 Ȱ�� : getDivisors
		
		
		return getDivisors(base).length == 2;
		
		
	}

	public static int[] getDivisors(int base) {
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
	public static boolean isDivisor(int base,int divisor) {
		return base % divisor == 0;
}
}