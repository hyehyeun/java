import java.util.Arrays;

public class NumbersȰ�� {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		Numbers nb = new Numbers();
		
		boolean result = nb.isDivisor(10,2);
		System.out.println(result);
		
		int[]array = nb.getDivisors(15);
		System.out.println(Arrays.toString(array));
		
		result = nb.isPrime(19);
		System.out.println(result);
	

	}

}
