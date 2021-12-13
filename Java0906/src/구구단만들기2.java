
public class 구구단만들기2 {

	public static void main(String[] args) {

//		for(int dan=2; dan<=9 ;dan++) {
//			
//			  System.out.print(dan + "단 : ");
//			  for(int num= 1 ; num<=9  ; num++ ) {
//				System.out.print(dan+ "*" +num + "=" +( num*2) + "  ");
//		}
//		      System.out.println();
//
//			
//		}
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2 ; dan <= 9; dan++) {
				System.out.print(dan + "*" + i + "=" + (dan * i) + "\t");
			}
			System.out.println();

		}
	}

}
