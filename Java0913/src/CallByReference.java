
public class CallByReference {

	public static void main(String[] args) {
		// callByValue
		int number = 3;
		print(number); //print���� number�� ����ǹǷ� ��������
		System.out.println(number);
		// callbyReference
		int[]array = {1,2,3};
		print(array);
		
		System.out.println(array[0]);
		

	}                       //�� ++�ǹǷ� 4����
	public static void print(int number) {
		System.out.println(number);
		number++; //number++ �ص� ���� print������ ���� ��ġ������
	}
	public static void print(int[] array) { //������ �迭
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		array[0] = 10;
	}

}
