
public class 구구단2단 {

	public static void main(String[] args) {
		// 2단 : 2*1=2 2*2=4 2*3=6 2*4=8 2*5=10 ....2*9=18
		
		for(int dan=2; dan<=9 ;dan++) {
		
		  System.out.print(dan + "단 : ");
		  for(int num= 1 ; num<=9  ; num++ ) {
			System.out.print(dan+ "*" +num + "=" +( num*2) + "  ");
	}
	      System.out.println();

		
	}
	}
}
 