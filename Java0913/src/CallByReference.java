
public class CallByReference {

	public static void main(String[] args) {
		// callByValue
		int number = 3;
		print(number); //print문에 number가 복사되므로 독립적임
		System.out.println(number);
		// callbyReference
		int[]array = {1,2,3};
		print(array);
		
		System.out.println(array[0]);
		

	}                       //↓ ++되므로 4가됨
	public static void print(int number) {
		System.out.println(number);
		number++; //number++ 해도 위에 print문에는 영향 미치지않음
	}
	public static void print(int[] array) { //정수형 배열
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		array[0] = 10;
	}

}
