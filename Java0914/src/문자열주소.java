import java.util.Scanner;

public class 문자열주소 {

	public static void main(String[] args) {
		// 리터럴 상수
		int num = 10;
		float f = 3.14f;
		String s = "바나나";		//바나나 두개지만 공간 하나임! 똑같으므로!! 
		String s2 = "바나나";    //컴파일 될 때 미리 작성된 내용
		
		System.out.println(s == s2);
		
		Scanner sc = new Scanner(System.in);  //늘 새롭게 공간 할당되어 입력됨
		String s3 = sc.next();  
		
		System.out.println(s==s3);

	}

}
